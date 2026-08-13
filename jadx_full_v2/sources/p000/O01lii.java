            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import kotlin.jvm.functions.Function1;
            
/* 39 */    public class O01lii implements O01OOloli, Il0I1ii, IOl1l0o0i1I0 {
                public ArrayList I00000oIO;
                public final O011OoiO1 I00000oOI;
                public final Function1 I0000Il00O;
                public final O01IIOOIO I0000O;
                public String I0000oI00;
                public String I0001Ioi1lo;
                public final int I000II;
                public Object I000O01llI0;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public O01lii(O011OoiO1 o011OoiO1, Function1 function1, int i) {
/* 7 */             this(o011OoiO1, function1, (char) 0);
/* 1 */             this.I000II = i;
                    switch (i) {
                        case 1:
/* 29 */                    this(o011OoiO1, function1, (char) 0);
/* 37 */                    this.I000O01llI0 = new LinkedHashMap();
                            break;
                        case 2:
/* 18 */                    this(o011OoiO1, function1, (char) 0);
/* 26 */                    this.I000O01llI0 = new ArrayList();
                            break;
                        default:
/* 14 */                    this.I00000oIO.add("primitive");
                            break;
                    }
                }

                @Override
                public final i1i0olI I00000oIO() {
/* 3 */             return this.I00000oOI.I00000oOI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function1] */
                @Override
                public final IOl1l0o0i1I0 I00000oOI(OilOloI oilOloI) {
                    IIOIlOoI111 iIOIlOoI111;
                    O01lii o01lii;
/* 7 */             int i = 2;
/* 8 */             if (IOOi0Ool1i.I00IoIO0lI(this.I00000oIO) == null) {
/* 10 */                iIOIlOoI111 = this.I0000Il00O;
                    } else {
/* 15 */                IIOIlOoI111 iIOIlOoI1112 = new IIOIlOoI111(i);
/* 18 */                iIOIlOoI1112.I00iiI = this;
/* 20 */                VarHandle.storeStoreFence();
                        iIOIlOoI111 = iIOIlOoI1112;
                    }
/* 23 */            lO1oIl1ii lo1oil1iiI000oI1ioi = oilOloI.I000oI1ioi();
/* 29 */            boolean zI0000O = O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000Il00O);
/* 33 */            O011OoiO1 o011OoiO1 = this.I00000oOI;
/* 35 */            if (zI0000O || (lo1oil1iiI000oI1ioi instanceof OO1l1i)) {
/* 100 */               o01lii = new O01lii(o011OoiO1, iIOIlOoI111, 2);
                    } else if (O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000O)) {
/* 58 */                OilOloI oilOloII00000oIO = liIOOi1iIII.I00000oIO(oilOloI.I000O01llI0(0), o011OoiO1.I00000oOI);
/* 62 */                lO1oIl1ii lo1oil1iiI000oI1ioi2 = oilOloII00000oIO.I000oI1ioi();
/* 68 */                if (!(lo1oil1iiI000oI1ioi2 instanceof OOIOoio0iiI) && !O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi2, Oili0Il.I00000oOI)) {
/* 83 */                    throw l0I0OO0.I00000oIO(oilOloII00000oIO);
                        }
/* 86 */                O01o1ilOlOI o01o1ilOlOI = new O01o1ilOlOI(o011OoiO1, iIOIlOoI111, 1);
/* 89 */                o01o1ilOlOI.I000OiO = true;
                        o01lii = o01o1ilOlOI;
                    } else {
/* 94 */                o01lii = new O01lii(o011OoiO1, iIOIlOoI111, 1);
                    }
/* 104 */           String str = this.I0000oI00;
/* 106 */           if (str != null) {
/* 110 */               if (o01lii instanceof O01o1ilOlOI) {
/* 113 */                   O01o1ilOlOI o01o1ilOlOI2 = (O01o1ilOlOI) o01lii;
/* 121 */                   o01o1ilOlOI2.I00Io1lO(O01O1110.I00000oOI(str), "key");
/* 124 */                   String strI00000oIO = this.I0001Ioi1lo;
/* 126 */                   if (strI00000oIO == null) {
/* 128 */                       strI00000oIO = oilOloI.I00000oIO();
                            }
/* 138 */                   o01o1ilOlOI2.I00Io1lO(O01O1110.I00000oOI(strI00000oIO), "value");
                        } else {
/* 142 */                   String strI00000oIO2 = this.I0001Ioi1lo;
/* 144 */                   if (strI00000oIO2 == null) {
/* 146 */                       strI00000oIO2 = oilOloI.I00000oIO();
                            }
/* 154 */                   o01lii.I00Io1lO(O01O1110.I00000oOI(strI00000oIO2), str);
                        }
/* 158 */               this.I0000oI00 = null;
/* 160 */               this.I0001Ioi1lo = null;
                    }
/* 186 */           return o01lii;
                }

                @Override
                public final void I0000Il00O() {
/* 7 */             String str = (String) IOOi0Ool1i.I00IoIO0lI(this.I00000oIO);
/* 9 */             if (str == null) {
/* 15 */                this.I0000Il00O.invoke(O01iI0i0.INSTANCE);
                    } else {
/* 21 */                I00Io1lO(O01iI0i0.INSTANCE, str);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(O0O01001OOII o0o01001ooii, Object obj) {
                    String strI0000Il00O;
                    O0O01001OOII o0o01001ooiiI00000oOI;
/* 3 */             Object objI00IoIO0lI = IOOi0Ool1i.I00IoIO0lI(this.I00000oIO);
/* 7 */             O011OoiO1 o011OoiO1 = this.I00000oOI;
/* 9 */             if (objI00IoIO0lI == null) {
/* 17 */                OilOloI oilOloII00000oIO = liIOOi1iIII.I00000oIO(o0o01001ooii.I0000O(), o011OoiO1.I00000oOI);
/* 27 */                if ((oilOloII00000oIO.I000oI1ioi() instanceof OOIOoio0iiI) || oilOloII00000oIO.I000oI1ioi() == Oili0Il.I00000oOI) {
/* 45 */                    new O01lii(o011OoiO1, this.I0000Il00O, 0).I0000O(o0o01001ooii, obj);
/* 48 */                    return;
                        }
                    }
/* 51 */            boolean z = o0o01001ooii instanceof I01IoO;
/* 53 */            IOIOiIloIi0 iOIOiIloIi0 = o011OoiO1.I00000oIO.I000O01llI0;
/* 55 */            if (z) {
/* 112 */               strI0000Il00O = iOIOiIloIi0 != IOIOiIloIi0.I00iOIl ? lI1lOI10li.I0000Il00O(o011OoiO1, o0o01001ooii.I0000O()) : null;
                    } else {
/* 62 */                int iOrdinal = iOIOiIloIi0.ordinal();
/* 66 */                if (iOrdinal != 0) {
/* 69 */                    if (iOrdinal == 1) {
/* 83 */                        lO1oIl1ii lo1oil1iiI000oI1ioi = o0o01001ooii.I0000O().I000oI1ioi();
/* 93 */                        if (O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I00000oOI) || O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000oI00)) {
                                }
                            } else if (iOrdinal != 2) {
/* 75 */                        I000II.I00000oIO();
/* 78 */                        return;
                            }
                        }
                    }
/* 113 */           if (z) {
/* 116 */               I01IoO i01IoO = (I01IoO) o0o01001ooii;
/* 118 */               if (obj == null) {
/* 133 */                   OIiilo1Ool0o.I0010o(i01IoO.I0000O(), "Value for serializer ", " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
/* 136 */                   return;
                        }
/* 120 */               o0o01001ooiiI00000oOI = lI1o0lI.I00000oOI(i01IoO, this, obj);
                    } else {
/* 137 */               o0o01001ooiiI00000oOI = o0o01001ooii;
                    }
/* 138 */           if (strI0000Il00O != null) {
/* 140 */               lI1lOI10li.I00000oIO(o011OoiO1, o0o01001ooii, o0o01001ooiiI00000oOI, strI0000Il00O);
/* 151 */               lI1lOI10li.I00000oOI(o0o01001ooiiI00000oOI.I0000O().I000oI1ioi());
/* 158 */               String strI00000oIO = o0o01001ooiiI00000oOI.I0000O().I00000oIO();
/* 162 */               this.I0000oI00 = strI0000Il00O;
/* 164 */               this.I0001Ioi1lo = strI00000oIO;
                    }
/* 166 */           o0o01001ooiiI00000oOI.I0000Il00O(this, obj);
                }

                @Override
                public final void I0000oI00() {
/* 7 */             if (!this.I00000oIO.isEmpty()) {
/* 9 */                 I00IlilI0i0i();
                    }
/* 18 */            this.I0000Il00O.invoke(I00IOO());
                }

                @Override
                public final void I0001Ioi1lo(double d) {
/* 5 */             I00II0oii1o(I00IlilI0i0i(), d);
                }

                @Override
                public final void I000II(short s) {
/* 15 */            I00Io1lO(O01O1110.I00000oIO(Short.valueOf(s)), (String) I00IlilI0i0i());
                }

                @Override
                public final void I000O01llI0(OilOloI oilOloI, int i, long j) {
/* 13 */            I00Io1lO(O01O1110.I00000oIO(Long.valueOf(j)), I00IioO0OiOi(oilOloI, i));
                }

                @Override
                public final void I000OOo1O(byte b) {
/* 15 */            I00Io1lO(O01O1110.I00000oIO(Byte.valueOf(b)), (String) I00IlilI0i0i());
                }

                @Override
                public final void I000OiO(boolean z) {
/* 5 */             String str = (String) I00IlilI0i0i();
/* 7 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 11 */            Iolii1loo1 iolii1loo1 = O01O1110.I00000oIO;
/* 20 */            I00Io1lO(new O01i0Iiil(boolValueOf, false, null), str);
                }

                @Override
                public final Il0I1ii I000iOII(OilOloI oilOloI) {
/* 7 */             if (IOOi0Ool1i.I00IoIO0lI(this.I00000oIO) == null) {
/* 38 */                return new O01lii(this.I00000oOI, this.I0000Il00O, 0).I000iOII(oilOloI);
                    }
/* 11 */            if (this.I0000oI00 != null) {
/* 17 */                this.I0001Ioi1lo = oilOloI.I00000oIO();
                    }
/* 23 */            return I00IO1oi11O(I00IlilI0i0i(), oilOloI);
                }

                @Override
                public final void I000l1(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 7 */             this.I00000oIO.add(I00IioO0OiOi(oilOloI, i));
/* 10 */            I0000O(o0o01001ooii, obj);
                }

                @Override
                public final void I000lI(float f) {
/* 5 */             I00IO1(I00IlilI0i0i(), f);
                }

                @Override
                public final void I000o00OoI0I(OilOloI oilOloI, int i, double d) {
/* 5 */             I00II0oii1o(I00IioO0OiOi(oilOloI, i), d);
                }

                @Override
                public final void I000oI1ioi(OOIOiioi1IlI oOIOiioi1IlI, int i, byte b) {
/* 13 */            I00Io1lO(O01O1110.I00000oIO(Byte.valueOf(b)), I00IioO0OiOi(oOIOiioi1IlI, i));
                }

                @Override
                public final void I00100l0(char c) {
/* 15 */            I00Io1lO(O01O1110.I00000oOI(String.valueOf(c)), (String) I00IlilI0i0i());
                }

                @Override
                public final void I00100o1O0lo(OOIOiioi1IlI oOIOiioi1IlI, int i, float f) {
/* 5 */             I00IO1(I00IioO0OiOi(oOIOiioi1IlI, i), f);
                }

                @Override
                public final void I0010I0i(OilOloI oilOloI, int i) {
/* 15 */            I00Io1lO(O01O1110.I00000oOI(oilOloI.I0001Ioi1lo(i)), (String) I00IlilI0i0i());
                }

                @Override
                public final void I0010o(OOIOiioi1IlI oOIOiioi1IlI, int i, short s) {
/* 13 */            I00Io1lO(O01O1110.I00000oIO(Short.valueOf(s)), I00IioO0OiOi(oOIOiioi1IlI, i));
                }

                @Override
                public final void I00111O(int i, int i2, OilOloI oilOloI) {
/* 13 */            I00Io1lO(O01O1110.I00000oIO(Integer.valueOf(i2)), I00IioO0OiOi(oilOloI, i));
                }

                @Override
                public final void I001IIilI0O(OOIOiioi1IlI oOIOiioi1IlI, int i, boolean z) {
/* 1 */             String strI00IioO0OiOi = I00IioO0OiOi(oOIOiioi1IlI, i);
/* 5 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 9 */             Iolii1loo1 iolii1loo1 = O01O1110.I00000oIO;
/* 18 */            I00Io1lO(new O01i0Iiil(boolValueOf, false, null), strI00IioO0OiOi);
                }

                @Override
                public final void I001IO000(OilOloI oilOloI, int i, String str) {
/* 9 */             I00Io1lO(O01O1110.I00000oOI(str), I00IioO0OiOi(oilOloI, i));
                }

                @Override
                public final void I001i1O0Ol(OOIOiioi1IlI oOIOiioi1IlI, int i, char c) {
/* 13 */            I00Io1lO(O01O1110.I00000oOI(String.valueOf(c)), I00IioO0OiOi(oOIOiioi1IlI, i));
                }

                @Override
                public final void I001i1lo1io(int i) {
/* 15 */            I00Io1lO(O01O1110.I00000oIO(Integer.valueOf(i)), (String) I00IlilI0i0i());
                }

                @Override
                public void I001iOo1i0O(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
                    switch (this.I000II) {
                        case 1:
/* 10 */                    if (obj != null || this.I0000O.I0000O) {
/* 18 */                        I00II0Ol1O0l(oilOloI, i, o0o01001ooii, obj);
                                break;
                            }
                            break;
                        default:
/* 6 */                     I00II0Ol1O0l(oilOloI, i, o0o01001ooii, obj);
                            break;
                    }
                }

                @Override
                public final void I001l0I00(long j) {
/* 15 */            I00Io1lO(O01O1110.I00000oIO(Long.valueOf(j)), (String) I00IlilI0i0i());
                }

                @Override
                public final boolean I001lIiIIo1O() {
/* 3 */             return this.I0000O.I00000oIO;
                }

                @Override
                public final Il0I1ii I001lllioOl(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 9 */             return I00IO1oi11O(I00IioO0OiOi(oOIOiioi1IlI, i), oOIOiioi1IlI.I000O01llI0(i));
                }

                @Override
                public final void I001lloI(String str) {
/* 11 */            I00Io1lO(O01O1110.I00000oOI(str), (String) I00IlilI0i0i());
                }

                public final void I00II0Ol1O0l(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 7 */             this.I00000oIO.add(I00IioO0OiOi(oilOloI, i));
/* 18 */            if (o0o01001ooii.I0000O().I0000Il00O()) {
/* 20 */                I0000O(o0o01001ooii, obj);
                    } else if (obj == null) {
/* 26 */                I0000Il00O();
                    } else {
/* 30 */                I0000O(o0o01001ooii, obj);
                    }
                }

                public final void I00II0oii1o(Object obj, double d) {
/* 1 */             String str = (String) obj;
/* 11 */            I00Io1lO(O01O1110.I00000oIO(Double.valueOf(d)), str);
/* 25 */            if (Math.abs(d) > Double.MAX_VALUE) {
/* 89 */                throw new O01Oio10O1l(l0I0OO0.I0001Ioi1lo(Double.valueOf(d), str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
                    }
                }

                public final void I00IO1(Object obj, float f) {
/* 1 */             String str = (String) obj;
/* 11 */            I00Io1lO(O01O1110.I00000oIO(Float.valueOf(f)), str);
/* 23 */            if (Math.abs(f) > Float.MAX_VALUE) {
/* 89 */                throw new O01Oio10O1l(l0I0OO0.I0001Ioi1lo(Float.valueOf(f), str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
                    }
                }

                public final Il0I1ii I00IO1oi11O(Object obj, OilOloI oilOloI) {
/* 1 */             String str = (String) obj;
/* 7 */             if (OlOl0IIi0OOl.I00000oIO(oilOloI)) {
/* 12 */                I011lOIoo0l i011lOIoo0l = new I011lOIoo0l(1);
/* 15 */                i011lOIoo0l.I00000oOI = this;
/* 17 */                i011lOIoo0l.I0000Il00O = str;
/* 23 */                i011lOIoo0l.I0000O = this.I00000oOI.I00000oOI;
/* 25 */                VarHandle.storeStoreFence();
/* 28 */                return i011lOIoo0l;
                    }
/* 33 */            if (!oilOloI.I00100o1O0lo() || !oilOloI.equals(O01O1110.I00000oIO)) {
/* 61 */                this.I00000oIO.add(str);
/* 89 */                return this;
                    }
/* 46 */            I011lOIoo0l i011lOIoo0l2 = new I011lOIoo0l(0);
/* 49 */            i011lOIoo0l2.I00000oOI = this;
/* 51 */            i011lOIoo0l2.I0000Il00O = str;
/* 53 */            i011lOIoo0l2.I0000O = oilOloI;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            return i011lOIoo0l2;
                }

                public O01O0o1iI I00IOO() {
                    switch (this.I000II) {
                        case 0:
/* 28 */                    O01O0o1iI o01O0o1iI = (O01O0o1iI) this.I000O01llI0;
/* 30 */                    if (o01O0o1iI != null) {
/* 39 */                        return o01O0o1iI;
                            }
/* 35 */                    I000II.I000iOII("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
/* 38 */                    return null;
                        case 1:
/* 22 */                    return new O01ioO1o0i11((LinkedHashMap) this.I000O01llI0);
                        default:
/* 12 */                    return new O011oi0l1O((ArrayList) this.I000O01llI0);
                    }
                }

                public final String I00IioO0OiOi(OilOloI oilOloI, int i) {
                    String strValueOf;
                    switch (this.I000II) {
                        case 2:
/* 16 */                    strValueOf = String.valueOf(i);
                            break;
                        default:
/* 8 */                     O01iI00o.I0000O(this.I00000oOI, oilOloI);
/* 11 */                    strValueOf = oilOloI.I0001Ioi1lo(i);
                            break;
                    }
/* 28 */            return strValueOf;
                }

                public final Object I00IlilI0i0i() {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 7 */             if (arrayList.isEmpty()) {
/* 29 */                throw new Oili1O("No tag in stack for requested element");
                    }
/* 13 */            return arrayList.remove(IOOi1I.I000II(arrayList));
                }

                public void I00Io1lO(O01O0o1iI o01O0o1iI, String str) {
                    switch (this.I000II) {
                        case 0:
/* 28 */                    if (str != "primitive") {
/* 52 */                        I000II.I000iOII("This output can only consume primitives with 'primitive' tag");
                                break;
                            } else if (((O01O0o1iI) this.I000O01llI0) != null) {
/* 46 */                        I000II.I000iOII("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                                break;
                            } else {
/* 36 */                        this.I000O01llI0 = o01O0o1iI;
/* 40 */                        this.I0000Il00O.invoke(o01O0o1iI);
                                break;
                            }
                        case 1:
/* 22 */                    ((LinkedHashMap) this.I000O01llI0).put(str, o01O0o1iI);
                            break;
                        default:
/* 14 */                    ((ArrayList) this.I000O01llI0).add(Integer.parseInt(str), o01O0o1iI);
                            break;
                    }
                }

/* 40 */        public O01lii(O011OoiO1 o011OoiO1, Function1 function1, char c) {
/* 42 */            this.I00000oIO = new ArrayList();
/* 43 */            this.I00000oOI = o011OoiO1;
/* 44 */            this.I0000Il00O = function1;
/* 46 */            this.I0000O = o011OoiO1.I00000oIO;
                }
            }
