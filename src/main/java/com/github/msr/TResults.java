/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.msr;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.15.0)", date = "2023-03-17")
public class TResults implements org.apache.thrift.TBase<TResults, TResults._Fields>, java.io.Serializable, Cloneable, Comparable<TResults> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResults");

    private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("results", org.apache.thrift.protocol.TType.LIST, (short)1);
    private static final org.apache.thrift.protocol.TField SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("schema", org.apache.thrift.protocol.TType.LIST, (short)2);
    private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)3);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TResultsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TResultsTupleSchemeFactory();

    public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> results; // required
    public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> schema; // optional
    public @org.apache.thrift.annotation.Nullable java.lang.String errorMessage; // optional

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        RESULTS((short)1, "results"),
        SCHEMA((short)2, "schema"),
        ERROR_MESSAGE((short)3, "errorMessage");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByThriftId(int fieldId) {
            switch(fieldId) {
                case 1: // RESULTS
                    return RESULTS;
                case 2: // SCHEMA
                    return SCHEMA;
                case 3: // ERROR_MESSAGE
                    return ERROR_MESSAGE;
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
            if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByName(java.lang.String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final _Fields optionals[] = {_Fields.SCHEMA,_Fields.ERROR_MESSAGE};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.RESULTS, new org.apache.thrift.meta_data.FieldMetaData("results", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
                        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
                                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
        tmpMap.put(_Fields.SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("schema", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
                        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
        tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResults.class, metaDataMap);
    }

    public TResults() {
    }

    public TResults(
            java.util.List<java.util.List<java.lang.String>> results)
    {
        this();
        this.results = results;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public TResults(TResults other) {
        if (other.isSetResults()) {
            java.util.List<java.util.List<java.lang.String>> __this__results = new java.util.ArrayList<java.util.List<java.lang.String>>(other.results.size());
            for (java.util.List<java.lang.String> other_element : other.results) {
                java.util.List<java.lang.String> __this__results_copy = new java.util.ArrayList<java.lang.String>(other_element);
                __this__results.add(__this__results_copy);
            }
            this.results = __this__results;
        }
        if (other.isSetSchema()) {
            java.util.List<java.lang.String> __this__schema = new java.util.ArrayList<java.lang.String>(other.schema);
            this.schema = __this__schema;
        }
        if (other.isSetErrorMessage()) {
            this.errorMessage = other.errorMessage;
        }
    }

    public TResults deepCopy() {
        return new TResults(this);
    }

    @Override
    public void clear() {
        this.results = null;
        this.schema = null;
        this.errorMessage = null;
    }

    public int getResultsSize() {
        return (this.results == null) ? 0 : this.results.size();
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.Iterator<java.util.List<java.lang.String>> getResultsIterator() {
        return (this.results == null) ? null : this.results.iterator();
    }

    public void addToResults(java.util.List<java.lang.String> elem) {
        if (this.results == null) {
            this.results = new java.util.ArrayList<java.util.List<java.lang.String>>();
        }
        this.results.add(elem);
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.List<java.util.List<java.lang.String>> getResults() {
        return this.results;
    }

    public TResults setResults(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> results) {
        this.results = results;
        return this;
    }

    public void unsetResults() {
        this.results = null;
    }

    /** Returns true if field results is set (has been assigned a value) and false otherwise */
    public boolean isSetResults() {
        return this.results != null;
    }

    public void setResultsIsSet(boolean value) {
        if (!value) {
            this.results = null;
        }
    }

    public int getSchemaSize() {
        return (this.schema == null) ? 0 : this.schema.size();
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.Iterator<java.lang.String> getSchemaIterator() {
        return (this.schema == null) ? null : this.schema.iterator();
    }

    public void addToSchema(java.lang.String elem) {
        if (this.schema == null) {
            this.schema = new java.util.ArrayList<java.lang.String>();
        }
        this.schema.add(elem);
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.List<java.lang.String> getSchema() {
        return this.schema;
    }

    public TResults setSchema(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> schema) {
        this.schema = schema;
        return this;
    }

    public void unsetSchema() {
        this.schema = null;
    }

    /** Returns true if field schema is set (has been assigned a value) and false otherwise */
    public boolean isSetSchema() {
        return this.schema != null;
    }

    public void setSchemaIsSet(boolean value) {
        if (!value) {
            this.schema = null;
        }
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public TResults setErrorMessage(@org.apache.thrift.annotation.Nullable java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public void unsetErrorMessage() {
        this.errorMessage = null;
    }

    /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
    public boolean isSetErrorMessage() {
        return this.errorMessage != null;
    }

    public void setErrorMessageIsSet(boolean value) {
        if (!value) {
            this.errorMessage = null;
        }
    }

    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
        switch (field) {
            case RESULTS:
                if (value == null) {
                    unsetResults();
                } else {
                    setResults((java.util.List<java.util.List<java.lang.String>>)value);
                }
                break;

            case SCHEMA:
                if (value == null) {
                    unsetSchema();
                } else {
                    setSchema((java.util.List<java.lang.String>)value);
                }
                break;

            case ERROR_MESSAGE:
                if (value == null) {
                    unsetErrorMessage();
                } else {
                    setErrorMessage((java.lang.String)value);
                }
                break;

        }
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case RESULTS:
                return getResults();

            case SCHEMA:
                return getSchema();

            case ERROR_MESSAGE:
                return getErrorMessage();

        }
        throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case RESULTS:
                return isSetResults();
            case SCHEMA:
                return isSetSchema();
            case ERROR_MESSAGE:
                return isSetErrorMessage();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that instanceof TResults)
            return this.equals((TResults)that);
        return false;
    }

    public boolean equals(TResults that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_results = true && this.isSetResults();
        boolean that_present_results = true && that.isSetResults();
        if (this_present_results || that_present_results) {
            if (!(this_present_results && that_present_results))
                return false;
            if (!this.results.equals(that.results))
                return false;
        }

        boolean this_present_schema = true && this.isSetSchema();
        boolean that_present_schema = true && that.isSetSchema();
        if (this_present_schema || that_present_schema) {
            if (!(this_present_schema && that_present_schema))
                return false;
            if (!this.schema.equals(that.schema))
                return false;
        }

        boolean this_present_errorMessage = true && this.isSetErrorMessage();
        boolean that_present_errorMessage = true && that.isSetErrorMessage();
        if (this_present_errorMessage || that_present_errorMessage) {
            if (!(this_present_errorMessage && that_present_errorMessage))
                return false;
            if (!this.errorMessage.equals(that.errorMessage))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetResults()) ? 131071 : 524287);
        if (isSetResults())
            hashCode = hashCode * 8191 + results.hashCode();

        hashCode = hashCode * 8191 + ((isSetSchema()) ? 131071 : 524287);
        if (isSetSchema())
            hashCode = hashCode * 8191 + schema.hashCode();

        hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
        if (isSetErrorMessage())
            hashCode = hashCode * 8191 + errorMessage.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(TResults other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.compare(isSetResults(), other.isSetResults());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetResults()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, other.results);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.compare(isSetSchema(), other.isSetSchema());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSchema()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema, other.schema);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.compare(isSetErrorMessage(), other.isSetErrorMessage());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetErrorMessage()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @org.apache.thrift.annotation.Nullable
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TResults(");
        boolean first = true;

        sb.append("results:");
        if (this.results == null) {
            sb.append("null");
        } else {
            sb.append(this.results);
        }
        first = false;
        if (isSetSchema()) {
            if (!first) sb.append(", ");
            sb.append("schema:");
            if (this.schema == null) {
                sb.append("null");
            } else {
                sb.append(this.schema);
            }
            first = false;
        }
        if (isSetErrorMessage()) {
            if (!first) sb.append(", ");
            sb.append("errorMessage:");
            if (this.errorMessage == null) {
                sb.append("null");
            } else {
                sb.append(this.errorMessage);
            }
            first = false;
        }
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class TResultsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public TResultsStandardScheme getScheme() {
            return new TResultsStandardScheme();
        }
    }

    private static class TResultsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TResults> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, TResults struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // RESULTS
                        if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                            {
                                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                                struct.results = new java.util.ArrayList<java.util.List<java.lang.String>>(_list0.size);
                                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem1;
                                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                                {
                                    {
                                        org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                                        _elem1 = new java.util.ArrayList<java.lang.String>(_list3.size);
                                        @org.apache.thrift.annotation.Nullable java.lang.String _elem4;
                                        for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                                        {
                                            _elem4 = iprot.readString();
                                            _elem1.add(_elem4);
                                        }
                                        iprot.readListEnd();
                                    }
                                    struct.results.add(_elem1);
                                }
                                iprot.readListEnd();
                            }
                            struct.setResultsIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // SCHEMA
                        if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                            {
                                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                                struct.schema = new java.util.ArrayList<java.lang.String>(_list6.size);
                                @org.apache.thrift.annotation.Nullable java.lang.String _elem7;
                                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                                {
                                    _elem7 = iprot.readString();
                                    struct.schema.add(_elem7);
                                }
                                iprot.readListEnd();
                            }
                            struct.setSchemaIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // ERROR_MESSAGE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.errorMessage = iprot.readString();
                            struct.setErrorMessageIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, TResults struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.results != null) {
                oprot.writeFieldBegin(RESULTS_FIELD_DESC);
                {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.results.size()));
                    for (java.util.List<java.lang.String> _iter9 : struct.results)
                    {
                        {
                            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter9.size()));
                            for (java.lang.String _iter10 : _iter9)
                            {
                                oprot.writeString(_iter10);
                            }
                            oprot.writeListEnd();
                        }
                    }
                    oprot.writeListEnd();
                }
                oprot.writeFieldEnd();
            }
            if (struct.schema != null) {
                if (struct.isSetSchema()) {
                    oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
                    {
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.schema.size()));
                        for (java.lang.String _iter11 : struct.schema)
                        {
                            oprot.writeString(_iter11);
                        }
                        oprot.writeListEnd();
                    }
                    oprot.writeFieldEnd();
                }
            }
            if (struct.errorMessage != null) {
                if (struct.isSetErrorMessage()) {
                    oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
                    oprot.writeString(struct.errorMessage);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class TResultsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public TResultsTupleScheme getScheme() {
            return new TResultsTupleScheme();
        }
    }

    private static class TResultsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TResults> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, TResults struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetResults()) {
                optionals.set(0);
            }
            if (struct.isSetSchema()) {
                optionals.set(1);
            }
            if (struct.isSetErrorMessage()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetResults()) {
                {
                    oprot.writeI32(struct.results.size());
                    for (java.util.List<java.lang.String> _iter12 : struct.results)
                    {
                        {
                            oprot.writeI32(_iter12.size());
                            for (java.lang.String _iter13 : _iter12)
                            {
                                oprot.writeString(_iter13);
                            }
                        }
                    }
                }
            }
            if (struct.isSetSchema()) {
                {
                    oprot.writeI32(struct.schema.size());
                    for (java.lang.String _iter14 : struct.schema)
                    {
                        oprot.writeString(_iter14);
                    }
                }
            }
            if (struct.isSetErrorMessage()) {
                oprot.writeString(struct.errorMessage);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, TResults struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TList _list15 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
                    struct.results = new java.util.ArrayList<java.util.List<java.lang.String>>(_list15.size);
                    @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem16;
                    for (int _i17 = 0; _i17 < _list15.size; ++_i17)
                    {
                        {
                            org.apache.thrift.protocol.TList _list18 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
                            _elem16 = new java.util.ArrayList<java.lang.String>(_list18.size);
                            @org.apache.thrift.annotation.Nullable java.lang.String _elem19;
                            for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                            {
                                _elem19 = iprot.readString();
                                _elem16.add(_elem19);
                            }
                        }
                        struct.results.add(_elem16);
                    }
                }
                struct.setResultsIsSet(true);
            }
            if (incoming.get(1)) {
                {
                    org.apache.thrift.protocol.TList _list21 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
                    struct.schema = new java.util.ArrayList<java.lang.String>(_list21.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _elem22;
                    for (int _i23 = 0; _i23 < _list21.size; ++_i23)
                    {
                        _elem22 = iprot.readString();
                        struct.schema.add(_elem22);
                    }
                }
                struct.setSchemaIsSet(true);
            }
            if (incoming.get(2)) {
                struct.errorMessage = iprot.readString();
                struct.setErrorMessageIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

