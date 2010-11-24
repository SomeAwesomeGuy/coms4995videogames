/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package network;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class TLobbyState implements TBase<TLobbyState, TLobbyState._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TLobbyState");

  private static final TField RED_ONE_FIELD_DESC = new TField("redOne", TType.STRING, (short)1);
  private static final TField RED_TWO_FIELD_DESC = new TField("redTwo", TType.STRING, (short)2);
  private static final TField BLUE_ONE_FIELD_DESC = new TField("blueOne", TType.STRING, (short)3);
  private static final TField BLUE_TWO_FIELD_DESC = new TField("blueTwo", TType.STRING, (short)4);
  private static final TField CHAT_FIELD_DESC = new TField("chat", TType.STRING, (short)5);

  public String redOne;
  public String redTwo;
  public String blueOne;
  public String blueTwo;
  public String chat;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RED_ONE((short)1, "redOne"),
    RED_TWO((short)2, "redTwo"),
    BLUE_ONE((short)3, "blueOne"),
    BLUE_TWO((short)4, "blueTwo"),
    CHAT((short)5, "chat");

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
        case 1: // RED_ONE
          return RED_ONE;
        case 2: // RED_TWO
          return RED_TWO;
        case 3: // BLUE_ONE
          return BLUE_ONE;
        case 4: // BLUE_TWO
          return BLUE_TWO;
        case 5: // CHAT
          return CHAT;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RED_ONE, new FieldMetaData("redOne", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.RED_TWO, new FieldMetaData("redTwo", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BLUE_ONE, new FieldMetaData("blueOne", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BLUE_TWO, new FieldMetaData("blueTwo", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CHAT, new FieldMetaData("chat", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TLobbyState.class, metaDataMap);
  }

  public TLobbyState() {
  }

  public TLobbyState(
    String redOne,
    String redTwo,
    String blueOne,
    String blueTwo,
    String chat)
  {
    this();
    this.redOne = redOne;
    this.redTwo = redTwo;
    this.blueOne = blueOne;
    this.blueTwo = blueTwo;
    this.chat = chat;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLobbyState(TLobbyState other) {
    if (other.isSetRedOne()) {
      this.redOne = other.redOne;
    }
    if (other.isSetRedTwo()) {
      this.redTwo = other.redTwo;
    }
    if (other.isSetBlueOne()) {
      this.blueOne = other.blueOne;
    }
    if (other.isSetBlueTwo()) {
      this.blueTwo = other.blueTwo;
    }
    if (other.isSetChat()) {
      this.chat = other.chat;
    }
  }

  public TLobbyState deepCopy() {
    return new TLobbyState(this);
  }

  @Override
  public void clear() {
    this.redOne = null;
    this.redTwo = null;
    this.blueOne = null;
    this.blueTwo = null;
    this.chat = null;
  }

  public String getRedOne() {
    return this.redOne;
  }

  public TLobbyState setRedOne(String redOne) {
    this.redOne = redOne;
    return this;
  }

  public void unsetRedOne() {
    this.redOne = null;
  }

  /** Returns true if field redOne is set (has been asigned a value) and false otherwise */
  public boolean isSetRedOne() {
    return this.redOne != null;
  }

  public void setRedOneIsSet(boolean value) {
    if (!value) {
      this.redOne = null;
    }
  }

  public String getRedTwo() {
    return this.redTwo;
  }

  public TLobbyState setRedTwo(String redTwo) {
    this.redTwo = redTwo;
    return this;
  }

  public void unsetRedTwo() {
    this.redTwo = null;
  }

  /** Returns true if field redTwo is set (has been asigned a value) and false otherwise */
  public boolean isSetRedTwo() {
    return this.redTwo != null;
  }

  public void setRedTwoIsSet(boolean value) {
    if (!value) {
      this.redTwo = null;
    }
  }

  public String getBlueOne() {
    return this.blueOne;
  }

  public TLobbyState setBlueOne(String blueOne) {
    this.blueOne = blueOne;
    return this;
  }

  public void unsetBlueOne() {
    this.blueOne = null;
  }

  /** Returns true if field blueOne is set (has been asigned a value) and false otherwise */
  public boolean isSetBlueOne() {
    return this.blueOne != null;
  }

  public void setBlueOneIsSet(boolean value) {
    if (!value) {
      this.blueOne = null;
    }
  }

  public String getBlueTwo() {
    return this.blueTwo;
  }

  public TLobbyState setBlueTwo(String blueTwo) {
    this.blueTwo = blueTwo;
    return this;
  }

  public void unsetBlueTwo() {
    this.blueTwo = null;
  }

  /** Returns true if field blueTwo is set (has been asigned a value) and false otherwise */
  public boolean isSetBlueTwo() {
    return this.blueTwo != null;
  }

  public void setBlueTwoIsSet(boolean value) {
    if (!value) {
      this.blueTwo = null;
    }
  }

  public String getChat() {
    return this.chat;
  }

  public TLobbyState setChat(String chat) {
    this.chat = chat;
    return this;
  }

  public void unsetChat() {
    this.chat = null;
  }

  /** Returns true if field chat is set (has been asigned a value) and false otherwise */
  public boolean isSetChat() {
    return this.chat != null;
  }

  public void setChatIsSet(boolean value) {
    if (!value) {
      this.chat = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RED_ONE:
      if (value == null) {
        unsetRedOne();
      } else {
        setRedOne((String)value);
      }
      break;

    case RED_TWO:
      if (value == null) {
        unsetRedTwo();
      } else {
        setRedTwo((String)value);
      }
      break;

    case BLUE_ONE:
      if (value == null) {
        unsetBlueOne();
      } else {
        setBlueOne((String)value);
      }
      break;

    case BLUE_TWO:
      if (value == null) {
        unsetBlueTwo();
      } else {
        setBlueTwo((String)value);
      }
      break;

    case CHAT:
      if (value == null) {
        unsetChat();
      } else {
        setChat((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RED_ONE:
      return getRedOne();

    case RED_TWO:
      return getRedTwo();

    case BLUE_ONE:
      return getBlueOne();

    case BLUE_TWO:
      return getBlueTwo();

    case CHAT:
      return getChat();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RED_ONE:
      return isSetRedOne();
    case RED_TWO:
      return isSetRedTwo();
    case BLUE_ONE:
      return isSetBlueOne();
    case BLUE_TWO:
      return isSetBlueTwo();
    case CHAT:
      return isSetChat();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLobbyState)
      return this.equals((TLobbyState)that);
    return false;
  }

  public boolean equals(TLobbyState that) {
    if (that == null)
      return false;

    boolean this_present_redOne = true && this.isSetRedOne();
    boolean that_present_redOne = true && that.isSetRedOne();
    if (this_present_redOne || that_present_redOne) {
      if (!(this_present_redOne && that_present_redOne))
        return false;
      if (!this.redOne.equals(that.redOne))
        return false;
    }

    boolean this_present_redTwo = true && this.isSetRedTwo();
    boolean that_present_redTwo = true && that.isSetRedTwo();
    if (this_present_redTwo || that_present_redTwo) {
      if (!(this_present_redTwo && that_present_redTwo))
        return false;
      if (!this.redTwo.equals(that.redTwo))
        return false;
    }

    boolean this_present_blueOne = true && this.isSetBlueOne();
    boolean that_present_blueOne = true && that.isSetBlueOne();
    if (this_present_blueOne || that_present_blueOne) {
      if (!(this_present_blueOne && that_present_blueOne))
        return false;
      if (!this.blueOne.equals(that.blueOne))
        return false;
    }

    boolean this_present_blueTwo = true && this.isSetBlueTwo();
    boolean that_present_blueTwo = true && that.isSetBlueTwo();
    if (this_present_blueTwo || that_present_blueTwo) {
      if (!(this_present_blueTwo && that_present_blueTwo))
        return false;
      if (!this.blueTwo.equals(that.blueTwo))
        return false;
    }

    boolean this_present_chat = true && this.isSetChat();
    boolean that_present_chat = true && that.isSetChat();
    if (this_present_chat || that_present_chat) {
      if (!(this_present_chat && that_present_chat))
        return false;
      if (!this.chat.equals(that.chat))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TLobbyState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TLobbyState typedOther = (TLobbyState)other;

    lastComparison = Boolean.valueOf(isSetRedOne()).compareTo(typedOther.isSetRedOne());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRedOne()) {
      lastComparison = TBaseHelper.compareTo(this.redOne, typedOther.redOne);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRedTwo()).compareTo(typedOther.isSetRedTwo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRedTwo()) {
      lastComparison = TBaseHelper.compareTo(this.redTwo, typedOther.redTwo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlueOne()).compareTo(typedOther.isSetBlueOne());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlueOne()) {
      lastComparison = TBaseHelper.compareTo(this.blueOne, typedOther.blueOne);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlueTwo()).compareTo(typedOther.isSetBlueTwo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlueTwo()) {
      lastComparison = TBaseHelper.compareTo(this.blueTwo, typedOther.blueTwo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChat()).compareTo(typedOther.isSetChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChat()) {
      lastComparison = TBaseHelper.compareTo(this.chat, typedOther.chat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // RED_ONE
          if (field.type == TType.STRING) {
            this.redOne = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RED_TWO
          if (field.type == TType.STRING) {
            this.redTwo = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // BLUE_ONE
          if (field.type == TType.STRING) {
            this.blueOne = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // BLUE_TWO
          if (field.type == TType.STRING) {
            this.blueTwo = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CHAT
          if (field.type == TType.STRING) {
            this.chat = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.redOne != null) {
      oprot.writeFieldBegin(RED_ONE_FIELD_DESC);
      oprot.writeString(this.redOne);
      oprot.writeFieldEnd();
    }
    if (this.redTwo != null) {
      oprot.writeFieldBegin(RED_TWO_FIELD_DESC);
      oprot.writeString(this.redTwo);
      oprot.writeFieldEnd();
    }
    if (this.blueOne != null) {
      oprot.writeFieldBegin(BLUE_ONE_FIELD_DESC);
      oprot.writeString(this.blueOne);
      oprot.writeFieldEnd();
    }
    if (this.blueTwo != null) {
      oprot.writeFieldBegin(BLUE_TWO_FIELD_DESC);
      oprot.writeString(this.blueTwo);
      oprot.writeFieldEnd();
    }
    if (this.chat != null) {
      oprot.writeFieldBegin(CHAT_FIELD_DESC);
      oprot.writeString(this.chat);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TLobbyState(");
    boolean first = true;

    sb.append("redOne:");
    if (this.redOne == null) {
      sb.append("null");
    } else {
      sb.append(this.redOne);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("redTwo:");
    if (this.redTwo == null) {
      sb.append("null");
    } else {
      sb.append(this.redTwo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blueOne:");
    if (this.blueOne == null) {
      sb.append("null");
    } else {
      sb.append(this.blueOne);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blueTwo:");
    if (this.blueTwo == null) {
      sb.append("null");
    } else {
      sb.append(this.blueTwo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("chat:");
    if (this.chat == null) {
      sb.append("null");
    } else {
      sb.append(this.chat);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
