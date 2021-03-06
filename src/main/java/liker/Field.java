/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package liker;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-01-24")
public class Field implements org.apache.thrift.TBase<Field, Field._Fields>, java.io.Serializable, Cloneable, Comparable<Field> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Field");

  private static final org.apache.thrift.protocol.TField FIELD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FIELD_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldValue", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INDEXED_FIELD_DESC = new org.apache.thrift.protocol.TField("indexed", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FieldTupleSchemeFactory());
  }

  public String fieldName; // required
  public String fieldValue; // required
  public boolean indexed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_NAME((short)1, "fieldName"),
    FIELD_VALUE((short)2, "fieldValue"),
    INDEXED((short)3, "indexed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIELD_NAME
          return FIELD_NAME;
        case 2: // FIELD_VALUE
          return FIELD_VALUE;
        case 3: // INDEXED
          return INDEXED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INDEXED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD_NAME, new org.apache.thrift.meta_data.FieldMetaData("fieldName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIELD_VALUE, new org.apache.thrift.meta_data.FieldMetaData("fieldValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEXED, new org.apache.thrift.meta_data.FieldMetaData("indexed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Field.class, metaDataMap);
  }

  public Field() {
  }

  public Field(
    String fieldName,
    String fieldValue,
    boolean indexed)
  {
    this();
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
    this.indexed = indexed;
    setIndexedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Field(Field other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFieldName()) {
      this.fieldName = other.fieldName;
    }
    if (other.isSetFieldValue()) {
      this.fieldValue = other.fieldValue;
    }
    this.indexed = other.indexed;
  }

  public Field deepCopy() {
    return new Field(this);
  }

  @Override
  public void clear() {
    this.fieldName = null;
    this.fieldValue = null;
    setIndexedIsSet(false);
    this.indexed = false;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public Field setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  public void unsetFieldName() {
    this.fieldName = null;
  }

  /** Returns true if field fieldName is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldName() {
    return this.fieldName != null;
  }

  public void setFieldNameIsSet(boolean value) {
    if (!value) {
      this.fieldName = null;
    }
  }

  public String getFieldValue() {
    return this.fieldValue;
  }

  public Field setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  public void unsetFieldValue() {
    this.fieldValue = null;
  }

  /** Returns true if field fieldValue is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldValue() {
    return this.fieldValue != null;
  }

  public void setFieldValueIsSet(boolean value) {
    if (!value) {
      this.fieldValue = null;
    }
  }

  public boolean isIndexed() {
    return this.indexed;
  }

  public Field setIndexed(boolean indexed) {
    this.indexed = indexed;
    setIndexedIsSet(true);
    return this;
  }

  public void unsetIndexed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEXED_ISSET_ID);
  }

  /** Returns true if field indexed is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexed() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEXED_ISSET_ID);
  }

  public void setIndexedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEXED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD_NAME:
      if (value == null) {
        unsetFieldName();
      } else {
        setFieldName((String)value);
      }
      break;

    case FIELD_VALUE:
      if (value == null) {
        unsetFieldValue();
      } else {
        setFieldValue((String)value);
      }
      break;

    case INDEXED:
      if (value == null) {
        unsetIndexed();
      } else {
        setIndexed((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_NAME:
      return getFieldName();

    case FIELD_VALUE:
      return getFieldValue();

    case INDEXED:
      return isIndexed();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD_NAME:
      return isSetFieldName();
    case FIELD_VALUE:
      return isSetFieldValue();
    case INDEXED:
      return isSetIndexed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Field)
      return this.equals((Field)that);
    return false;
  }

  public boolean equals(Field that) {
    if (that == null)
      return false;

    boolean this_present_fieldName = true && this.isSetFieldName();
    boolean that_present_fieldName = true && that.isSetFieldName();
    if (this_present_fieldName || that_present_fieldName) {
      if (!(this_present_fieldName && that_present_fieldName))
        return false;
      if (!this.fieldName.equals(that.fieldName))
        return false;
    }

    boolean this_present_fieldValue = true && this.isSetFieldValue();
    boolean that_present_fieldValue = true && that.isSetFieldValue();
    if (this_present_fieldValue || that_present_fieldValue) {
      if (!(this_present_fieldValue && that_present_fieldValue))
        return false;
      if (!this.fieldValue.equals(that.fieldValue))
        return false;
    }

    boolean this_present_indexed = true;
    boolean that_present_indexed = true;
    if (this_present_indexed || that_present_indexed) {
      if (!(this_present_indexed && that_present_indexed))
        return false;
      if (this.indexed != that.indexed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fieldName = true && (isSetFieldName());
    list.add(present_fieldName);
    if (present_fieldName)
      list.add(fieldName);

    boolean present_fieldValue = true && (isSetFieldValue());
    list.add(present_fieldValue);
    if (present_fieldValue)
      list.add(fieldValue);

    boolean present_indexed = true;
    list.add(present_indexed);
    if (present_indexed)
      list.add(indexed);

    return list.hashCode();
  }

  @Override
  public int compareTo(Field other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFieldName()).compareTo(other.isSetFieldName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldName, other.fieldName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFieldValue()).compareTo(other.isSetFieldValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldValue, other.fieldValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndexed()).compareTo(other.isSetIndexed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexed, other.indexed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Field(");
    boolean first = true;

    sb.append("fieldName:");
    if (this.fieldName == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fieldValue:");
    if (this.fieldValue == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldValue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("indexed:");
    sb.append(this.indexed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FieldStandardSchemeFactory implements SchemeFactory {
    public FieldStandardScheme getScheme() {
      return new FieldStandardScheme();
    }
  }

  private static class FieldStandardScheme extends StandardScheme<Field> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Field struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fieldName = iprot.readString();
              struct.setFieldNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIELD_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fieldValue = iprot.readString();
              struct.setFieldValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INDEXED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.indexed = iprot.readBool();
              struct.setIndexedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Field struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldName != null) {
        oprot.writeFieldBegin(FIELD_NAME_FIELD_DESC);
        oprot.writeString(struct.fieldName);
        oprot.writeFieldEnd();
      }
      if (struct.fieldValue != null) {
        oprot.writeFieldBegin(FIELD_VALUE_FIELD_DESC);
        oprot.writeString(struct.fieldValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEXED_FIELD_DESC);
      oprot.writeBool(struct.indexed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FieldTupleSchemeFactory implements SchemeFactory {
    public FieldTupleScheme getScheme() {
      return new FieldTupleScheme();
    }
  }

  private static class FieldTupleScheme extends TupleScheme<Field> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Field struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFieldName()) {
        optionals.set(0);
      }
      if (struct.isSetFieldValue()) {
        optionals.set(1);
      }
      if (struct.isSetIndexed()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFieldName()) {
        oprot.writeString(struct.fieldName);
      }
      if (struct.isSetFieldValue()) {
        oprot.writeString(struct.fieldValue);
      }
      if (struct.isSetIndexed()) {
        oprot.writeBool(struct.indexed);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Field struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.fieldName = iprot.readString();
        struct.setFieldNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fieldValue = iprot.readString();
        struct.setFieldValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.indexed = iprot.readBool();
        struct.setIndexedIsSet(true);
      }
    }
  }

}

