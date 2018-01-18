//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.plcopen.xml.tc60201 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory implements org.plcopen.xml.tc60201.PlcNode{


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.plcopen.xml.tc60201
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Project }
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue }
     */
    public org.plcopen.xml.tc60201.RootValue createValue() {
        return new org.plcopen.xml.tc60201.RootValue();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue.StructValue }
     */
    public org.plcopen.xml.tc60201.RootValue.StructValue createValueStructValue() {
        return new org.plcopen.xml.tc60201.RootValue.StructValue();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue.ArrayValue }
     */
    public org.plcopen.xml.tc60201.RootValue.ArrayValue createValueArrayValue() {
        return new org.plcopen.xml.tc60201.RootValue.ArrayValue();
    }

    /**
     * Create an instance of {@link VarListAccess }
     */
    public VarListAccess createVarListAccess() {
        return new VarListAccess();
    }

    /**
     * Create an instance of {@link VarListPlain }
     */
    public VarListPlain createVarListPlain() {
        return new VarListPlain();
    }

    /**
     * Create an instance of {@link AddDataInfo }
     */
    public AddDataInfo createAddDataInfo() {
        return new AddDataInfo();
    }

    /**
     * Create an instance of {@link VarListConfig }
     */
    public VarListConfig createVarListConfig() {
        return new VarListConfig();
    }

    /**
     * Create an instance of {@link Body }
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link SFC }
     */
    public SFC createBodySFC() {
        return new SFC();
    }

    /**
     * Create an instance of {@link SFC.SimultaneousDivergence }
     */
    public SFC.SimultaneousDivergence createBodySFCSimultaneousDivergence() {
        return new SFC.SimultaneousDivergence();
    }

    /**
     * Create an instance of {@link SFC.SelectionConvergence }
     */
    public SFC.SelectionConvergence createBodySFCSelectionConvergence() {
        return new SFC.SelectionConvergence();
    }

    /**
     * Create an instance of {@link SFC.SelectionDivergence }
     */
    public SFC.SelectionDivergence createBodySFCSelectionDivergence() {
        return new SFC.SelectionDivergence();
    }

    /**
     * Create an instance of {@link SFC.Transition }
     */
    public SFC.Transition createBodySFCTransition() {
        return new SFC.Transition();
    }

    /**
     * Create an instance of {@link SFC.Transition.Condition }
     */
    public SFC.Transition.Condition createBodySFCTransitionCondition() {
        return new SFC.Transition.Condition();
    }

    /**
     * Create an instance of {@link SFC.Step }
     */
    public SFC.Step createBodySFCStep() {
        return new SFC.Step();
    }

    /**
     * Create an instance of {@link SFC.LeftPowerRail }
     */
    public SFC.LeftPowerRail createBodySFCLeftPowerRail() {
        return new SFC.LeftPowerRail();
    }

    /**
     * Create an instance of {@link SFC.Block }
     */
    public SFC.Block createBodySFCBlock() {
        return new SFC.Block();
    }

    /**
     * Create an instance of {@link SFC.Block.OutputVariables }
     */
    public SFC.Block.OutputVariables createBodySFCBlockOutputVariables() {
        return new SFC.Block.OutputVariables();
    }

    /**
     * Create an instance of {@link SFC.Block.InOutVariables }
     */
    public SFC.Block.InOutVariables createBodySFCBlockInOutVariables() {
        return new SFC.Block.InOutVariables();
    }

    /**
     * Create an instance of {@link SFC.Block.InputVariables }
     */
    public SFC.Block.InputVariables createBodySFCBlockInputVariables() {
        return new SFC.Block.InputVariables();
    }

    /**
     * Create an instance of {@link SFC.VendorElement }
     */
    public SFC.VendorElement createBodySFCVendorElement() {
        return new SFC.VendorElement();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.OutputVariables }
     */
    public SFC.VendorElement.OutputVariables createBodySFCVendorElementOutputVariables() {
        return new SFC.VendorElement.OutputVariables();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.InOutVariables }
     */
    public SFC.VendorElement.InOutVariables createBodySFCVendorElementInOutVariables() {
        return new SFC.VendorElement.InOutVariables();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.InputVariables }
     */
    public SFC.VendorElement.InputVariables createBodySFCVendorElementInputVariables() {
        return new SFC.VendorElement.InputVariables();
    }

    /**
     * Create an instance of {@link SFC.ActionBlock }
     */
    public SFC.ActionBlock createBodySFCActionBlock() {
        return new SFC.ActionBlock();
    }

    /**
     * Create an instance of {@link SFC.ActionBlock.Action }
     */
    public SFC.ActionBlock.Action createBodySFCActionBlockAction() {
        return new SFC.ActionBlock.Action();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.DataType }
     */
    public org.plcopen.xml.tc60201.DataType createDataType() {
        return new org.plcopen.xml.tc60201.DataType();
    }

    /**
     * Create an instance of {@link PlcEnum }
     */
    public PlcEnum createDataTypeEnum() {
        return new PlcEnum();
    }

    /**
     * Create an instance of {@link Values }
     */
    public Values createDataTypeEnumValues() {
        return new Values();
    }

    /**
     * Create an instance of {@link AddData }
     */
    public AddData createAddData() {
        return new AddData();
    }

    /**
     * Create an instance of {@link Instances }
     */
    public Instances createProjectInstances() {
        return new Instances();
    }

    /**
     * Create an instance of {@link Instances.Configurations }
     */
    public Instances.Configurations createProjectInstancesConfigurations() {
        return new Instances.Configurations();
    }

    /**
     * Create an instance of {@link Instances.Configurations.Configuration }
     */
    public Instances.Configurations.Configuration createProjectInstancesConfigurationsConfiguration() {
        return new Instances.Configurations.Configuration();
    }

    /**
     * Create an instance of {@link Instances.Configurations.Configuration.Resource }
     */
    public Instances.Configurations.Configuration.Resource createProjectInstancesConfigurationsConfigurationResource() {
        return new Instances.Configurations.Configuration.Resource();
    }

    /**
     * Create an instance of {@link Types }
     */
    public Types createProjectTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link Pous }
     */
    public Pous createProjectTypesPous() {
        return new Pous();
    }

    /**
     * Create an instance of {@link Pou }
     */
    public Pou createProjectTypesPousPou() {
        return new Pou();
    }

    /**
     * Create an instance of {@link Pou.Transitions }
     */
    public Pou.Transitions createProjectTypesPousPouTransitions() {
        return new Pou.Transitions();
    }

    /**
     * Create an instance of {@link Pou.Actions }
     */
    public Pou.Actions createProjectTypesPousPouActions() {
        return new Pou.Actions();
    }

    /**
     * Create an instance of {@link Pou.Interface }
     */
    public Pou.Interface createProjectTypesPousPouInterface() {
        return new Pou.Interface();
    }

    /**
     * Create an instance of {@link DataTypes }
     */
    public DataTypes createProjectTypesDataTypes() {
        return new DataTypes();
    }

    /**
     * Create an instance of {@link ContentHeader }
     */
    public ContentHeader createProjectContentHeader() {
        return new ContentHeader();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo }
     */
    public ContentHeader.CoordinateInfo createProjectContentHeaderCoordinateInfo() {
        return new ContentHeader.CoordinateInfo();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Sfc }
     */
    public ContentHeader.CoordinateInfo.Sfc createProjectContentHeaderCoordinateInfoSfc() {
        return new ContentHeader.CoordinateInfo.Sfc();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Ld }
     */
    public ContentHeader.CoordinateInfo.Ld createProjectContentHeaderCoordinateInfoLd() {
        return new ContentHeader.CoordinateInfo.Ld();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Fbd }
     */
    public ContentHeader.CoordinateInfo.Fbd createProjectContentHeaderCoordinateInfoFbd() {
        return new ContentHeader.CoordinateInfo.Fbd();
    }

    /**
     * Create an instance of {@link FileHeader }
     */
    public FileHeader createProjectFileHeader() {
        return new FileHeader();
    }

    /**
     * Create an instance of {@link FormattedText }
     */
    public FormattedText createFormattedText() {
        return new FormattedText();
    }

    /**
     * Create an instance of {@link RangeSigned }
     */
    public RangeSigned createRangeSigned() {
        return new RangeSigned();
    }

    /**
     * Create an instance of {@link RangeUnsigned }
     */
    public RangeUnsigned createRangeUnsigned() {
        return new RangeUnsigned();
    }

    /**
     * Create an instance of {@link VarList }
     */
    public VarList createVarList() {
        return new VarList();
    }

    /**
     * Create an instance of {@link PouInstance }
     */
    public PouInstance createPouInstance() {
        return new PouInstance();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.ConnectionPointIn }
     */
    public org.plcopen.xml.tc60201.ConnectionPointIn createConnectionPointIn() {
        return new org.plcopen.xml.tc60201.ConnectionPointIn();
    }

    /**
     * Create an instance of {@link Connection }
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link Position }
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.ConnectionPointOut }
     */
    public org.plcopen.xml.tc60201.ConnectionPointOut createConnectionPointOut() {
        return new org.plcopen.xml.tc60201.ConnectionPointOut();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue.SimpleValue }
     */
    public org.plcopen.xml.tc60201.RootValue.SimpleValue createValueSimpleValue() {
        return new org.plcopen.xml.tc60201.RootValue.SimpleValue();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue.StructValue.Value }
     */
    public org.plcopen.xml.tc60201.RootValue.StructValue.Value createValueStructValueValue() {
        return new org.plcopen.xml.tc60201.RootValue.StructValue.Value();
    }

    /**
     * Create an instance of {@link org.plcopen.xml.tc60201.RootValue.ArrayValue.Value }
     */
    public org.plcopen.xml.tc60201.RootValue.ArrayValue.Value createValueArrayValueValue() {
        return new org.plcopen.xml.tc60201.RootValue.ArrayValue.Value();
    }

    /**
     * Create an instance of {@link VarListAccess.AccessVariable }
     */
    public VarListAccess.AccessVariable createVarListAccessAccessVariable() {
        return new VarListAccess.AccessVariable();
    }

    /**
     * Create an instance of {@link VarListPlain.Variable }
     */
    public VarListPlain.Variable createVarListPlainVariable() {
        return new VarListPlain.Variable();
    }

    /**
     * Create an instance of {@link Info }
     */
    public Info createAddDataInfoInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link VarListConfig.ConfigVariable }
     */
    public VarListConfig.ConfigVariable createVarListConfigConfigVariable() {
        return new VarListConfig.ConfigVariable();
    }

    /**
     * Create an instance of {@link FBD }
     */
    public FBD createBodyFBD() {
        return new FBD();
    }

    /**
     * Create an instance of {@link LD }
     */
    public LD createBodyLD() {
        return new LD();
    }

    /**
     * Create an instance of {@link SFC.Comment }
     */
    public SFC.Comment createBodySFCComment() {
        return new SFC.Comment();
    }

    /**
     * Create an instance of {@link SFC.Error }
     */
    public SFC.Error createBodySFCError() {
        return new SFC.Error();
    }

    /**
     * Create an instance of {@link SFC.Connector }
     */
    public SFC.Connector createBodySFCConnector() {
        return new SFC.Connector();
    }

    /**
     * Create an instance of {@link SFC.Continuation }
     */
    public SFC.Continuation createBodySFCContinuation() {
        return new SFC.Continuation();
    }

    /**
     * Create an instance of {@link SFC.InVariable }
     */
    public SFC.InVariable createBodySFCInVariable() {
        return new SFC.InVariable();
    }

    /**
     * Create an instance of {@link SFC.OutVariable }
     */
    public SFC.OutVariable createBodySFCOutVariable() {
        return new SFC.OutVariable();
    }

    /**
     * Create an instance of {@link SFC.InOutVariable }
     */
    public SFC.InOutVariable createBodySFCInOutVariable() {
        return new SFC.InOutVariable();
    }

    /**
     * Create an instance of {@link SFC.Label }
     */
    public SFC.Label createBodySFCLabel() {
        return new SFC.Label();
    }

    /**
     * Create an instance of {@link SFC.Jump }
     */
    public SFC.Jump createBodySFCJump() {
        return new SFC.Jump();
    }

    /**
     * Create an instance of {@link SFC.Return }
     */
    public SFC.Return createBodySFCReturn() {
        return new SFC.Return();
    }

    /**
     * Create an instance of {@link SFC.RightPowerRail }
     */
    public SFC.RightPowerRail createBodySFCRightPowerRail() {
        return new SFC.RightPowerRail();
    }

    /**
     * Create an instance of {@link SFC.Coil }
     */
    public SFC.Coil createBodySFCCoil() {
        return new SFC.Coil();
    }

    /**
     * Create an instance of {@link SFC.Contact }
     */
    public SFC.Contact createBodySFCContact() {
        return new SFC.Contact();
    }

    /**
     * Create an instance of {@link SFC.MacroStep }
     */
    public SFC.MacroStep createBodySFCMacroStep() {
        return new SFC.MacroStep();
    }

    /**
     * Create an instance of {@link SFC.JumpStep }
     */
    public SFC.JumpStep createBodySFCJumpStep() {
        return new SFC.JumpStep();
    }

    /**
     * Create an instance of {@link SFC.SimultaneousConvergence }
     */
    public SFC.SimultaneousConvergence createBodySFCSimultaneousConvergence() {
        return new SFC.SimultaneousConvergence();
    }

    /**
     * Create an instance of {@link SFC.SimultaneousDivergence.ConnectionPointOut }
     */
    public SFC.SimultaneousDivergence.ConnectionPointOut createBodySFCSimultaneousDivergenceConnectionPointOut() {
        return new SFC.SimultaneousDivergence.ConnectionPointOut();
    }

    /**
     * Create an instance of {@link SFC.SelectionConvergence.ConnectionPointIn }
     */
    public SFC.SelectionConvergence.ConnectionPointIn createBodySFCSelectionConvergenceConnectionPointIn() {
        return new SFC.SelectionConvergence.ConnectionPointIn();
    }

    /**
     * Create an instance of {@link SFC.SelectionDivergence.ConnectionPointOut }
     */
    public SFC.SelectionDivergence.ConnectionPointOut createBodySFCSelectionDivergenceConnectionPointOut() {
        return new SFC.SelectionDivergence.ConnectionPointOut();
    }

    /**
     * Create an instance of {@link SFC.Transition.Condition.Reference }
     */
    public SFC.Transition.Condition.Reference createBodySFCTransitionConditionReference() {
        return new SFC.Transition.Condition.Reference();
    }

    /**
     * Create an instance of {@link SFC.Transition.Condition.Inline }
     */
    public SFC.Transition.Condition.Inline createBodySFCTransitionConditionInline() {
        return new SFC.Transition.Condition.Inline();
    }

    /**
     * Create an instance of {@link SFC.Step.ConnectionPointOut }
     */
    public SFC.Step.ConnectionPointOut createBodySFCStepConnectionPointOut() {
        return new SFC.Step.ConnectionPointOut();
    }

    /**
     * Create an instance of {@link SFC.Step.ConnectionPointOutAction }
     */
    public SFC.Step.ConnectionPointOutAction createBodySFCStepConnectionPointOutAction() {
        return new SFC.Step.ConnectionPointOutAction();
    }

    /**
     * Create an instance of {@link SFC.LeftPowerRail.ConnectionPointOut }
     */
    public SFC.LeftPowerRail.ConnectionPointOut createBodySFCLeftPowerRailConnectionPointOut() {
        return new SFC.LeftPowerRail.ConnectionPointOut();
    }

    /**
     * Create an instance of {@link SFC.Block.OutputVariables.Variable }
     */
    public SFC.Block.OutputVariables.Variable createBodySFCBlockOutputVariablesVariable() {
        return new SFC.Block.OutputVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.Block.InOutVariables.Variable }
     */
    public SFC.Block.InOutVariables.Variable createBodySFCBlockInOutVariablesVariable() {
        return new SFC.Block.InOutVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.Block.InputVariables.Variable }
     */
    public SFC.Block.InputVariables.Variable createBodySFCBlockInputVariablesVariable() {
        return new SFC.Block.InputVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.OutputVariables.Variable }
     */
    public SFC.VendorElement.OutputVariables.Variable createBodySFCVendorElementOutputVariablesVariable() {
        return new SFC.VendorElement.OutputVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.InOutVariables.Variable }
     */
    public SFC.VendorElement.InOutVariables.Variable createBodySFCVendorElementInOutVariablesVariable() {
        return new SFC.VendorElement.InOutVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.VendorElement.InputVariables.Variable }
     */
    public SFC.VendorElement.InputVariables.Variable createBodySFCVendorElementInputVariablesVariable() {
        return new SFC.VendorElement.InputVariables.Variable();
    }

    /**
     * Create an instance of {@link SFC.ActionBlock.Action.Reference }
     */
    public SFC.ActionBlock.Action.Reference createBodySFCActionBlockActionReference() {
        return new SFC.ActionBlock.Action.Reference();
    }

    /**
     * Create an instance of {@link PlcString }
     */
    public PlcString createDataTypeString() {
        return new PlcString();
    }

    /**
     * Create an instance of {@link Wstring }
     */
    public Wstring createDataTypeWstring() {
        return new Wstring();
    }

    /**
     * Create an instance of {@link PlcArray }
     */
    public PlcArray createDataTypeArray() {
        return new PlcArray();
    }

    /**
     * Create an instance of {@link Derived }
     */
    public Derived createDataTypeDerived() {
        return new Derived();
    }

    /**
     * Create an instance of {@link SubrangeSigned }
     */
    public SubrangeSigned createDataTypeSubrangeSigned() {
        return new SubrangeSigned();
    }

    /**
     * Create an instance of {@link SubrangeUnsigned }
     */
    public SubrangeUnsigned createDataTypeSubrangeUnsigned() {
        return new SubrangeUnsigned();
    }

    /**
     * Create an instance of {@link Pointer }
     */
    public Pointer createDataTypePointer() {
        return new Pointer();
    }

    /**
     * Create an instance of {@link Values.Value }
     */
    public Values.Value createDataTypeEnumValuesValue() {
        return new Values.Value();
    }

    /**
     * Create an instance of {@link Data }
     */
    public Data createAddDataData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Instances.Configurations.Configuration.Resource.Task }
     */
    public Instances.Configurations.Configuration.Resource.Task createProjectInstancesConfigurationsConfigurationResourceTask() {
        return new Instances.Configurations.Configuration.Resource.Task();
    }

    /**
     * Create an instance of {@link Pou.Transitions.Transition }
     */
    public Pou.Transitions.Transition createProjectTypesPousPouTransitionsTransition() {
        return new Pou.Transitions.Transition();
    }

    /**
     * Create an instance of {@link Pou.Actions.Action }
     */
    public Pou.Actions.Action createProjectTypesPousPouActionsAction() {
        return new Pou.Actions.Action();
    }

    /**
     * Create an instance of {@link Pou.Interface.LocalVars }
     */
    public Pou.Interface.LocalVars createProjectTypesPousPouInterfaceLocalVars() {
        return new Pou.Interface.LocalVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.TempVars }
     */
    public Pou.Interface.TempVars createProjectTypesPousPouInterfaceTempVars() {
        return new Pou.Interface.TempVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.InputVars }
     */
    public Pou.Interface.InputVars createProjectTypesPousPouInterfaceInputVars() {
        return new Pou.Interface.InputVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.OutputVars }
     */
    public Pou.Interface.OutputVars createProjectTypesPousPouInterfaceOutputVars() {
        return new Pou.Interface.OutputVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.InOutVars }
     */
    public Pou.Interface.InOutVars createProjectTypesPousPouInterfaceInOutVars() {
        return new Pou.Interface.InOutVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.ExternalVars }
     */
    public Pou.Interface.ExternalVars createProjectTypesPousPouInterfaceExternalVars() {
        return new Pou.Interface.ExternalVars();
    }

    /**
     * Create an instance of {@link Pou.Interface.GlobalVars }
     */
    public Pou.Interface.GlobalVars createProjectTypesPousPouInterfaceGlobalVars() {
        return new Pou.Interface.GlobalVars();
    }

    /**
     * Create an instance of {@link DataTypes.DataType }
     */
    public DataTypes.DataType createProjectTypesDataTypesDataType() {
        return new DataTypes.DataType();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.PageSize }
     */
    public ContentHeader.CoordinateInfo.PageSize createProjectContentHeaderCoordinateInfoPageSize() {
        return new ContentHeader.CoordinateInfo.PageSize();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Sfc.Scaling }
     */
    public ContentHeader.CoordinateInfo.Sfc.Scaling createProjectContentHeaderCoordinateInfoSfcScaling() {
        return new ContentHeader.CoordinateInfo.Sfc.Scaling();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Ld.Scaling }
     */
    public ContentHeader.CoordinateInfo.Ld.Scaling createProjectContentHeaderCoordinateInfoLdScaling() {
        return new ContentHeader.CoordinateInfo.Ld.Scaling();
    }

    /**
     * Create an instance of {@link ContentHeader.CoordinateInfo.Fbd.Scaling }
     */
    public ContentHeader.CoordinateInfo.Fbd.Scaling createProjectContentHeaderCoordinateInfoFbdScaling() {
        return new ContentHeader.CoordinateInfo.Fbd.Scaling();
    }

}
