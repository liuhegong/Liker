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
public class IndexRequestParam implements org.apache.thrift.TBase<IndexRequestParam, IndexRequestParam._Fields>, java.io.Serializable, Cloneable, Comparable<IndexRequestParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IndexRequestParam");

  private static final org.apache.thrift.protocol.TField CURRENT_PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("currentPage", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("pageSize", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField KEYWORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("keywords", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField RESPONSE_FIELD_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("responseFieldNames", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IndexRequestParamStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IndexRequestParamTupleSchemeFactory());
  }

  public int currentPage; // required
  public int pageSize; // required
  public List<Keyword> keywords; // required
  public List<String> responseFieldNames; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CURRENT_PAGE((short)1, "currentPage"),
    PAGE_SIZE((short)2, "pageSize"),
    KEYWORDS((short)3, "keywords"),
    RESPONSE_FIELD_NAMES((short)4, "responseFieldNames");

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
        case 1: // CURRENT_PAGE
          return CURRENT_PAGE;
        case 2: // PAGE_SIZE
          return PAGE_SIZE;
        case 3: // KEYWORDS
          return KEYWORDS;
        case 4: // RESPONSE_FIELD_NAMES
          return RESPONSE_FIELD_NAMES;
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
  private static final int __CURRENTPAGE_ISSET_ID = 0;
  private static final int __PAGESIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CURRENT_PAGE, new org.apache.thrift.meta_data.FieldMetaData("currentPage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("pageSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.KEYWORDS, new org.apache.thrift.meta_data.FieldMetaData("keywords", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Keyword.class))));
    tmpMap.put(_Fields.RESPONSE_FIELD_NAMES, new org.apache.thrift.meta_data.FieldMetaData("responseFieldNames", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IndexRequestParam.class, metaDataMap);
  }

  public IndexRequestParam() {
    this.pageSize = 1000;

  }

  public IndexRequestParam(
    int currentPage,
    int pageSize,
    List<Keyword> keywords,
    List<String> responseFieldNames)
  {
    this();
    this.currentPage = currentPage;
    setCurrentPageIsSet(true);
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    this.keywords = keywords;
    this.responseFieldNames = responseFieldNames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexRequestParam(IndexRequestParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.currentPage = other.currentPage;
    this.pageSize = other.pageSize;
    if (other.isSetKeywords()) {
      List<Keyword> __this__keywords = new ArrayList<Keyword>(other.keywords.size());
      for (Keyword other_element : other.keywords) {
        __this__keywords.add(new Keyword(other_element));
      }
      this.keywords = __this__keywords;
    }
    if (other.isSetResponseFieldNames()) {
      List<String> __this__responseFieldNames = new ArrayList<String>(other.responseFieldNames);
      this.responseFieldNames = __this__responseFieldNames;
    }
  }

  public IndexRequestParam deepCopy() {
    return new IndexRequestParam(this);
  }

  @Override
  public void clear() {
    setCurrentPageIsSet(false);
    this.currentPage = 0;
    this.pageSize = 1000;

    this.keywords = null;
    this.responseFieldNames = null;
  }

  public int getCurrentPage() {
    return this.currentPage;
  }

  public IndexRequestParam setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
    setCurrentPageIsSet(true);
    return this;
  }

  public void unsetCurrentPage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURRENTPAGE_ISSET_ID);
  }

  /** Returns true if field currentPage is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentPage() {
    return EncodingUtils.testBit(__isset_bitfield, __CURRENTPAGE_ISSET_ID);
  }

  public void setCurrentPageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURRENTPAGE_ISSET_ID, value);
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public IndexRequestParam setPageSize(int pageSize) {
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    return this;
  }

  public void unsetPageSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  /** Returns true if field pageSize is set (has been assigned a value) and false otherwise */
  public boolean isSetPageSize() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  public void setPageSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGESIZE_ISSET_ID, value);
  }

  public int getKeywordsSize() {
    return (this.keywords == null) ? 0 : this.keywords.size();
  }

  public java.util.Iterator<Keyword> getKeywordsIterator() {
    return (this.keywords == null) ? null : this.keywords.iterator();
  }

  public void addToKeywords(Keyword elem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<Keyword>();
    }
    this.keywords.add(elem);
  }

  public List<Keyword> getKeywords() {
    return this.keywords;
  }

  public IndexRequestParam setKeywords(List<Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public void unsetKeywords() {
    this.keywords = null;
  }

  /** Returns true if field keywords is set (has been assigned a value) and false otherwise */
  public boolean isSetKeywords() {
    return this.keywords != null;
  }

  public void setKeywordsIsSet(boolean value) {
    if (!value) {
      this.keywords = null;
    }
  }

  public int getResponseFieldNamesSize() {
    return (this.responseFieldNames == null) ? 0 : this.responseFieldNames.size();
  }

  public java.util.Iterator<String> getResponseFieldNamesIterator() {
    return (this.responseFieldNames == null) ? null : this.responseFieldNames.iterator();
  }

  public void addToResponseFieldNames(String elem) {
    if (this.responseFieldNames == null) {
      this.responseFieldNames = new ArrayList<String>();
    }
    this.responseFieldNames.add(elem);
  }

  public List<String> getResponseFieldNames() {
    return this.responseFieldNames;
  }

  public IndexRequestParam setResponseFieldNames(List<String> responseFieldNames) {
    this.responseFieldNames = responseFieldNames;
    return this;
  }

  public void unsetResponseFieldNames() {
    this.responseFieldNames = null;
  }

  /** Returns true if field responseFieldNames is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseFieldNames() {
    return this.responseFieldNames != null;
  }

  public void setResponseFieldNamesIsSet(boolean value) {
    if (!value) {
      this.responseFieldNames = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CURRENT_PAGE:
      if (value == null) {
        unsetCurrentPage();
      } else {
        setCurrentPage((Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((Integer)value);
      }
      break;

    case KEYWORDS:
      if (value == null) {
        unsetKeywords();
      } else {
        setKeywords((List<Keyword>)value);
      }
      break;

    case RESPONSE_FIELD_NAMES:
      if (value == null) {
        unsetResponseFieldNames();
      } else {
        setResponseFieldNames((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CURRENT_PAGE:
      return getCurrentPage();

    case PAGE_SIZE:
      return getPageSize();

    case KEYWORDS:
      return getKeywords();

    case RESPONSE_FIELD_NAMES:
      return getResponseFieldNames();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CURRENT_PAGE:
      return isSetCurrentPage();
    case PAGE_SIZE:
      return isSetPageSize();
    case KEYWORDS:
      return isSetKeywords();
    case RESPONSE_FIELD_NAMES:
      return isSetResponseFieldNames();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexRequestParam)
      return this.equals((IndexRequestParam)that);
    return false;
  }

  public boolean equals(IndexRequestParam that) {
    if (that == null)
      return false;

    boolean this_present_currentPage = true;
    boolean that_present_currentPage = true;
    if (this_present_currentPage || that_present_currentPage) {
      if (!(this_present_currentPage && that_present_currentPage))
        return false;
      if (this.currentPage != that.currentPage)
        return false;
    }

    boolean this_present_pageSize = true;
    boolean that_present_pageSize = true;
    if (this_present_pageSize || that_present_pageSize) {
      if (!(this_present_pageSize && that_present_pageSize))
        return false;
      if (this.pageSize != that.pageSize)
        return false;
    }

    boolean this_present_keywords = true && this.isSetKeywords();
    boolean that_present_keywords = true && that.isSetKeywords();
    if (this_present_keywords || that_present_keywords) {
      if (!(this_present_keywords && that_present_keywords))
        return false;
      if (!this.keywords.equals(that.keywords))
        return false;
    }

    boolean this_present_responseFieldNames = true && this.isSetResponseFieldNames();
    boolean that_present_responseFieldNames = true && that.isSetResponseFieldNames();
    if (this_present_responseFieldNames || that_present_responseFieldNames) {
      if (!(this_present_responseFieldNames && that_present_responseFieldNames))
        return false;
      if (!this.responseFieldNames.equals(that.responseFieldNames))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_currentPage = true;
    list.add(present_currentPage);
    if (present_currentPage)
      list.add(currentPage);

    boolean present_pageSize = true;
    list.add(present_pageSize);
    if (present_pageSize)
      list.add(pageSize);

    boolean present_keywords = true && (isSetKeywords());
    list.add(present_keywords);
    if (present_keywords)
      list.add(keywords);

    boolean present_responseFieldNames = true && (isSetResponseFieldNames());
    list.add(present_responseFieldNames);
    if (present_responseFieldNames)
      list.add(responseFieldNames);

    return list.hashCode();
  }

  @Override
  public int compareTo(IndexRequestParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCurrentPage()).compareTo(other.isSetCurrentPage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentPage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currentPage, other.currentPage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageSize()).compareTo(other.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageSize, other.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeywords()).compareTo(other.isSetKeywords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeywords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keywords, other.keywords);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseFieldNames()).compareTo(other.isSetResponseFieldNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseFieldNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseFieldNames, other.responseFieldNames);
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
    StringBuilder sb = new StringBuilder("IndexRequestParam(");
    boolean first = true;

    sb.append("currentPage:");
    sb.append(this.currentPage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageSize:");
    sb.append(this.pageSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("keywords:");
    if (this.keywords == null) {
      sb.append("null");
    } else {
      sb.append(this.keywords);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("responseFieldNames:");
    if (this.responseFieldNames == null) {
      sb.append("null");
    } else {
      sb.append(this.responseFieldNames);
    }
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

  private static class IndexRequestParamStandardSchemeFactory implements SchemeFactory {
    public IndexRequestParamStandardScheme getScheme() {
      return new IndexRequestParamStandardScheme();
    }
  }

  private static class IndexRequestParamStandardScheme extends StandardScheme<IndexRequestParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IndexRequestParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CURRENT_PAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.currentPage = iprot.readI32();
              struct.setCurrentPageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageSize = iprot.readI32();
              struct.setPageSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // KEYWORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.keywords = new ArrayList<Keyword>(_list8.size);
                Keyword _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new Keyword();
                  _elem9.read(iprot);
                  struct.keywords.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setKeywordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RESPONSE_FIELD_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.responseFieldNames = new ArrayList<String>(_list11.size);
                String _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readString();
                  struct.responseFieldNames.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setResponseFieldNamesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, IndexRequestParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CURRENT_PAGE_FIELD_DESC);
      oprot.writeI32(struct.currentPage);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.pageSize);
      oprot.writeFieldEnd();
      if (struct.keywords != null) {
        oprot.writeFieldBegin(KEYWORDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.keywords.size()));
          for (Keyword _iter14 : struct.keywords)
          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.responseFieldNames != null) {
        oprot.writeFieldBegin(RESPONSE_FIELD_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.responseFieldNames.size()));
          for (String _iter15 : struct.responseFieldNames)
          {
            oprot.writeString(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IndexRequestParamTupleSchemeFactory implements SchemeFactory {
    public IndexRequestParamTupleScheme getScheme() {
      return new IndexRequestParamTupleScheme();
    }
  }

  private static class IndexRequestParamTupleScheme extends TupleScheme<IndexRequestParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IndexRequestParam struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCurrentPage()) {
        optionals.set(0);
      }
      if (struct.isSetPageSize()) {
        optionals.set(1);
      }
      if (struct.isSetKeywords()) {
        optionals.set(2);
      }
      if (struct.isSetResponseFieldNames()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCurrentPage()) {
        oprot.writeI32(struct.currentPage);
      }
      if (struct.isSetPageSize()) {
        oprot.writeI32(struct.pageSize);
      }
      if (struct.isSetKeywords()) {
        {
          oprot.writeI32(struct.keywords.size());
          for (Keyword _iter16 : struct.keywords)
          {
            _iter16.write(oprot);
          }
        }
      }
      if (struct.isSetResponseFieldNames()) {
        {
          oprot.writeI32(struct.responseFieldNames.size());
          for (String _iter17 : struct.responseFieldNames)
          {
            oprot.writeString(_iter17);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IndexRequestParam struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.currentPage = iprot.readI32();
        struct.setCurrentPageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pageSize = iprot.readI32();
        struct.setPageSizeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.keywords = new ArrayList<Keyword>(_list18.size);
          Keyword _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = new Keyword();
            _elem19.read(iprot);
            struct.keywords.add(_elem19);
          }
        }
        struct.setKeywordsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.responseFieldNames = new ArrayList<String>(_list21.size);
          String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.responseFieldNames.add(_elem22);
          }
        }
        struct.setResponseFieldNamesIsSet(true);
      }
    }
  }

}

