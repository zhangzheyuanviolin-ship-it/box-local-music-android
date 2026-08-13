            package p000;

            import java.io.IOException;
            import p000.O01lo1il;
            
/* 18 */    public abstract class O011ioiO1OI {

                public class I00000oIO extends O011ioiO1OI {
                    final O011ioiO1OI val$delegate;

                    public I00000oIO(O011ioiO1OI o011ioiO1OI) {
/* 3 */                 this.val$delegate = o011ioiO1OI;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 3 */                 return this.val$delegate.fromJson(o01lo1il);
                    }

                    @Override
                    public boolean isLenient() {
/* 3 */                 return this.val$delegate.isLenient();
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 boolean serializeNulls = o01ooIO00oio.getSerializeNulls();
/* 6 */                 o01ooIO00oio.setSerializeNulls(true);
                        try {
/* 11 */                    this.val$delegate.toJson(o01ooIO00oio, obj);
                        } finally {
/* 19 */                    o01ooIO00oio.setSerializeNulls(serializeNulls);
                        }
                    }

                    public String toString() {
/* 16 */                return this.val$delegate + ".serializeNulls()";
                    }
                }

                public class I00000oOI extends O011ioiO1OI {
                    final O011ioiO1OI val$delegate;

                    public I00000oOI(O011ioiO1OI o011ioiO1OI) {
/* 3 */                 this.val$delegate = o011ioiO1OI;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 1 */                 boolean zIsLenient = o01lo1il.isLenient();
/* 6 */                 o01lo1il.setLenient(true);
                        try {
/* 11 */                    return this.val$delegate.fromJson(o01lo1il);
                        } finally {
/* 20 */                    o01lo1il.setLenient(zIsLenient);
                        }
                    }

                    @Override
                    public boolean isLenient() {
/* 1 */                 return true;
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 boolean zIsLenient = o01ooIO00oio.isLenient();
/* 6 */                 o01ooIO00oio.setLenient(true);
                        try {
/* 11 */                    this.val$delegate.toJson(o01ooIO00oio, obj);
                        } finally {
/* 19 */                    o01ooIO00oio.setLenient(zIsLenient);
                        }
                    }

                    public String toString() {
/* 16 */                return this.val$delegate + ".lenient()";
                    }
                }

                public class I0000Il00O extends O011ioiO1OI {
                    final O011ioiO1OI val$delegate;

                    public I0000Il00O(O011ioiO1OI o011ioiO1OI) {
/* 3 */                 this.val$delegate = o011ioiO1OI;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 1 */                 boolean zFailOnUnknown = o01lo1il.failOnUnknown();
/* 6 */                 o01lo1il.setFailOnUnknown(true);
                        try {
/* 11 */                    return this.val$delegate.fromJson(o01lo1il);
                        } finally {
/* 20 */                    o01lo1il.setFailOnUnknown(zFailOnUnknown);
                        }
                    }

                    @Override
                    public boolean isLenient() {
/* 3 */                 return this.val$delegate.isLenient();
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 3 */                 this.val$delegate.toJson(o01ooIO00oio, obj);
                    }

                    public String toString() {
/* 16 */                return this.val$delegate + ".failOnUnknown()";
                    }
                }

                public class I0000O extends O011ioiO1OI {
                    final O011ioiO1OI val$delegate;
                    final String val$indent;

                    public I0000O(O011ioiO1OI o011ioiO1OI, String str) {
/* 3 */                 this.val$delegate = o011ioiO1OI;
/* 5 */                 this.val$indent = str;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 3 */                 return this.val$delegate.fromJson(o01lo1il);
                    }

                    @Override
                    public boolean isLenient() {
/* 3 */                 return this.val$delegate.isLenient();
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 String indent = o01ooIO00oio.getIndent();
/* 7 */                 o01ooIO00oio.setIndent(this.val$indent);
                        try {
/* 12 */                    this.val$delegate.toJson(o01ooIO00oio, obj);
                        } finally {
/* 20 */                    o01ooIO00oio.setIndent(indent);
                        }
                    }

                    public String toString() {
/* 3 */                 StringBuilder sb = new StringBuilder();
/* 8 */                 sb.append(this.val$delegate);
/* 13 */                sb.append(".indent(\"");
/* 20 */                return IIl001iO0Io.I00100l0(sb, this.val$indent, "\")");
                    }
                }

                public final O011ioiO1OI failOnUnknown() {
/* 3 */             return new I0000Il00O(this);
                }

                public abstract Object fromJson(O01lo1il o01lo1il);

                public final Object fromJson(String str) {
/* 3 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 6 */             iII1o0lOio0.I00oo1iO0ll(str);
/* 9 */             O01lo1il o01lo1ilOf = O01lo1il.of(iII1o0lOio0);
/* 13 */            Object objFromJson = fromJson(o01lo1ilOf);
/* 21 */            if (isLenient() || o01lo1ilOf.peek() == O01lo1il.I00000oOI.END_DOCUMENT) {
/* 49 */                return objFromJson;
                    }
/* 39 */            throw new O01IiOo11l1o("JSON document was not fully consumed.");
                }

                public final Object fromJsonValue(Object obj) {
                    try {
/* 6 */                 return fromJson(new O01oiIi1(obj));
                    } catch (IOException e) {
/* 12 */                I000II.I000O01llI0(e);
/* 15 */                return null;
                    }
                }

                public O011ioiO1OI indent(String str) {
/* 1 */             if (str != null) {
/* 5 */                 return new I0000O(this, str);
                    }
/* 11 */            IOOlIIilOl0.I000II("indent == null");
/* 14 */            return null;
                }

                public boolean isLenient() {
/* 1 */             return false;
                }

                public final O011ioiO1OI lenient() {
/* 3 */             return new I00000oOI(this);
                }

                public final O011ioiO1OI nonNull() {
                    return this instanceof OIIo0lIOiI ? this : new OIIo0lIOiI(this);
                }

                public final O011ioiO1OI nullSafe() {
                    return this instanceof OIOO0IiIo ? this : new OIOO0IiIo(this);
                }

                public final O011ioiO1OI serializeNulls() {
/* 3 */             return new I00000oIO(this);
                }

                public final String toJson(Object obj) {
/* 3 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
                    try {
/* 6 */                 toJson(iII1o0lOio0, obj);
/* 9 */                 return iII1o0lOio0.I00Ol00();
                    } catch (IOException e) {
/* 15 */                I000II.I000O01llI0(e);
/* 18 */                return null;
                    }
                }

                public abstract void toJson(O01ooIO00oio o01ooIO00oio, Object obj);

                public final Object toJsonValue(Object obj) {
/* 3 */             O01olI o01olI = new O01olI();
                    try {
/* 6 */                 toJson(o01olI, obj);
/* 9 */                 return o01olI.root();
                    } catch (IOException e) {
/* 15 */                I000II.I000O01llI0(e);
/* 18 */                return null;
                    }
                }

/* 19 */        public final void toJson(IIIIiol iIIIiol, Object obj) {
/* 21 */            toJson(O01ooIO00oio.of(iIIIiol), obj);
                }

/* 40 */        public final Object fromJson(IIIIlO11I0lO iIIIlO11I0lO) {
/* 41 */            return fromJson(O01lo1il.of(iIIIlO11I0lO));
                }
            }
