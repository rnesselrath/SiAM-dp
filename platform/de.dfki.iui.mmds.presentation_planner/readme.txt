Presentation Planner Component

The presentation planner component handles three underspecified types of output messages from the dialogue component and manipulates them before they are distributed to the output devices.

1. Output acts with a communicative function but no output representation
2. Output act with a representation but no specified output device
3. Output act with a representation but no specified language

The workflow of the presentation planner for the three different types is as follows:

1. In the case that only the communicative function on a semantic level is given, the presentation planner tries to generate output representations based on the for the project given output mapping rules. Here three different cases are distinguished:

	a) The attribute ‘addressee’ of the output act is specified.
	The presentation planner searches for output mapping rules that create output which is supported by the user interfaces the addressee actually uses. If the pattern of one of these mapping rules also matches the communicative function of the output act, an output representation for the appropriate device is generated. If a mapping target doesn’t specify a language, case 3) is applied afterwards.

	b) The attribute ‘session’ of the output act is specified. No ‘addressee’ is specified.
	The behavior is similar to the case a) with the difference that all members of the defined session are used as addressees.

	c) Neither an addressee nor the session are specified.
	The presentation planner searches for the first mapping rule whose pattern matches the communicative function. All output representations in this rule are generated and added to the output act. If a mapping target doesn’t specify the attribute ‘language’ and/or ‘device’, cases 2) and/or 3) are applied afterwards.

2. The presentation planner searches for output devices that support the type of the given output representation and sets the value of the device attribute to the ids of these devices (actually addressee and session are not considered).

3. The presentation planner adds the standard language as defined in the resource manager. (configuration file dfki.iui.mmds.core.resourcemanager.properties)