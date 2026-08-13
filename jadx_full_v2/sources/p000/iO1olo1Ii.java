            package p000;
            
/* 27 */    public abstract class iO1olo1Ii implements Il0I1ii, IOl1l0o0i1I0 {
                @Override
                public void I0000Il00O() {
/* 29 */            throw new Oili1O("'null' is not supported by default");
                }

                @Override
                public void I0001Ioi1lo(double d) {
/* 5 */             I00II0oii1o(Double.valueOf(d));
                }

                @Override
                public void I000II(short s) {
/* 5 */             I00II0oii1o(Short.valueOf(s));
                }

                @Override
                public void I000O01llI0(OilOloI oilOloI, int i, long j) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 4 */             I001l0I00(j);
                }

                @Override
                public void I000OOo1O(byte b) {
/* 5 */             I00II0oii1o(Byte.valueOf(b));
                }

                @Override
                public void I000OiO(boolean z) {
/* 5 */             I00II0oii1o(Boolean.valueOf(z));
                }

                @Override
                public void I000l1(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 4 */             I0000O(o0o01001ooii, obj);
                }

                @Override
                public void I000lI(float f) {
/* 5 */             I00II0oii1o(Float.valueOf(f));
                }

                @Override
                public void I000o00OoI0I(OilOloI oilOloI, int i, double d) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 4 */             I0001Ioi1lo(d);
                }

                @Override
                public void I000oI1ioi(OOIOiioi1IlI oOIOiioi1IlI, int i, byte b) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 4 */             I000OOo1O(b);
                }

                @Override
                public void I00100l0(char c) {
/* 5 */             I00II0oii1o(Character.valueOf(c));
                }

                @Override
                public void I00100o1O0lo(OOIOiioi1IlI oOIOiioi1IlI, int i, float f) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 4 */             I000lI(f);
                }

                @Override
                public void I0010I0i(OilOloI oilOloI, int i) {
/* 5 */             I00II0oii1o(Integer.valueOf(i));
                }

                @Override
                public void I0010o(OOIOiioi1IlI oOIOiioi1IlI, int i, short s) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 4 */             I000II(s);
                }

                @Override
                public void I00111O(int i, int i2, OilOloI oilOloI) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 4 */             I001i1lo1io(i2);
                }

                @Override
                public void I001IIilI0O(OOIOiioi1IlI oOIOiioi1IlI, int i, boolean z) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 4 */             I000OiO(z);
                }

                @Override
                public void I001IO000(OilOloI oilOloI, int i, String str) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 4 */             I001lloI(str);
                }

                @Override
                public void I001i1O0Ol(OOIOiioi1IlI oOIOiioi1IlI, int i, char c) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 4 */             I00100l0(c);
                }

                @Override
                public void I001i1lo1io(int i) {
/* 5 */             I00II0oii1o(Integer.valueOf(i));
                }

                public void I001iOo1i0O(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 1 */             I00II0Ol1O0l(oilOloI, i);
/* 12 */            if (o0o01001ooii.I0000O().I0000Il00O()) {
/* 14 */                I0000O(o0o01001ooii, obj);
                    } else if (obj == null) {
/* 20 */                I0000Il00O();
                    } else {
/* 24 */                I0000O(o0o01001ooii, obj);
                    }
                }

                @Override
                public void I001l0I00(long j) {
/* 5 */             I00II0oii1o(Long.valueOf(j));
                }

                @Override
                public Il0I1ii I001lllioOl(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 1 */             I00II0Ol1O0l(oOIOiioi1IlI, i);
/* 8 */             return I000iOII(oOIOiioi1IlI.I000O01llI0(i));
                }

                @Override
                public void I001lloI(String str) {
/* 1 */             I00II0oii1o(str);
                }

                public void I00II0oii1o(Object obj) {
/* 7 */             StringBuilder sb = new StringBuilder("Non-serializable ");
/* 10 */            Class<?> cls = obj.getClass();
/* 14 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 20 */            sb.append(oOoOl1001II.I00000oOI(cls));
/* 25 */            sb.append(" is not supported by ");
/* 36 */            sb.append(oOoOl1001II.I00000oOI(getClass()));
/* 41 */            sb.append(" encoder");
/* 186 */           throw new Oili1O(sb.toString());
                }

/* 28 */        public void I0000oI00() {
                }

                @Override
/* 48 */        public IOl1l0o0i1I0 I00000oOI(OilOloI oilOloI) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Il0I1ii I000iOII(OilOloI oilOloI) {
/* 49 */            return this;
                }

/* 88 */        public void I00II0Ol1O0l(OilOloI oilOloI, int i) {
                }
            }
