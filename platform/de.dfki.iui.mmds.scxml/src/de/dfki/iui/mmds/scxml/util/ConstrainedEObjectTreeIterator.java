/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
package de.dfki.iui.mmds.scxml.util;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * ConstrainedEObjectTreeIterator enables to iterate over the given content (for example the root of a content tree)
 * and yields all EObjects in the content tree which satisfy some specific constraints.
 * 
 * <UL>
 * <LI>Subclasses must provide the constraints-check method which is used in the iteration.</LI>
 * <LI>The method {@link #remove()} is not supported in this iterator s.t. an exception is thrown whenever the method
 * is called.</LI>
 * <LI>The iteration follows the <code>depth-first-approach</code>.</LI>
 * </UL>
 * 
 * @author eude01
 *
 */
abstract public class ConstrainedEObjectTreeIterator implements Iterable<EObject>, Iterator<EObject> {

	private EObject parent;
	private EObject next;
	private EList<EStructuralFeature> feats;
	private List<?> objs;
	private int pos = 0,
			featPos = 0,
			elNum = 0;
	
	
	public ConstrainedEObjectTreeIterator( EObject content ) {
		feats = (parent = next = content).eClass().getEAllStructuralFeatures();
		next();
	}
	

	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public EObject next() {
		if ( next == null ) {
			throw new NoSuchElementException( String.format( "There are no elements left satisfying the constraints. (yield elements: %d) ", elNum ));
		}
		EObject oldNext = next;
		boolean cont = true;
		
		while ( cont ) {
			if ( objs != null ) {
				// 1) check a many-feature value (list of candidates)
				Object o = null;
				while ( !(o instanceof EObject) && pos < objs.size() ) {
					o = objs.get( pos++ );
				}
				
				if ( o instanceof EObject ) {
					// probably the next eobject is found, stop the looping in such a case
					cont = checkCandidate( o );
				} else {
					// in the next loop step let's check the next feature
					objs = null;
					pos = 0;
				}
			} else if ( featPos < feats.size() ) {
				// 2) check the next feature
				EStructuralFeature f = feats.get( featPos++ );
				Object o = parent.eGet( f );
				if ( f.isMany() ) {
					// in case of a many-feature value check all elements in the list
					objs = (List<?>) o;
				} else {
					// probably the next eobject is found, stop the looping in such a case
					cont = checkCandidate( o );
				}
			} else {
				// 3) go 1 step up (one of the next grandparent's children) and take another one
				EObject grandparent = parent.eContainer();
				if ( grandparent == null ) {
					// nowhere to go therefore stop the search and the iteration
					cont = false;
					next = null;
				} else {
					EReference ref = parent.eContainmentFeature();
					if ( ref.isMany() ) {
						objs = (List<?>) grandparent.eGet( ref );
						pos = objs.indexOf( parent ) + 1;
					}
					next = null;
					parent = grandparent;
					feats = parent.eClass().getEAllStructuralFeatures();
					featPos = feats.indexOf( ref );
				}
			}
		}
		
		elNum++;
		return oldNext;
	}
	
	/**
	 * @param o
	 * @return
	 */
	private boolean checkCandidate( Object o ) {
		boolean cont = !checkConstraints( next = (EObject) o );
		
		// go 1 level deeper in any case
		parent = next;
		feats = parent.eClass().getEAllStructuralFeatures();
		objs = null;
		pos = 0;
		featPos = 0;
		
		next = cont ? null : next;
		return cont;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException( String.format( "Remove operation in %s.%s not implemented!", getClass().getPackage().getName(), getClass().getSimpleName() ));
	}

	@Override
	public Iterator<EObject> iterator() {
		return this;
	}
	
	/**
	 * Represents the check method which is used to identify the found eobject, i.e. whether it is the
	 * next result of the iteration or not.
	 * 
	 * @param eobj the next candidate
	 * @return
	 */
	abstract public boolean checkConstraints( EObject eobj );

}
