            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class OIll100 implements IIi0O1OOO1i0, OIll1oO1 {
                public static final O1OoooIi1Ol0 I00l0I0l0lO1 = new O1OoooIi1Ol0(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                public IIOoi0ooOoO I00iOIl;
                public IIOo0liIi I00iiI;
                public IliiI1 I00iiO;
                public OIll1lio I00iio;
                public List I00ilI0I1;
                public float I00ilO0;
                public float I00io1l = -1.0f;
                public AbstractMap I00ioIO = new HashMap();

                public OIll100(IIOoi0ooOoO iIOoi0ooOoO) {
/* 8 */             this.I00iOIl = iIOoi0ooOoO;
/* 21 */            IliiI1 iliiI1I00000oIO = OlIl10I01i.I00000oIO(getName());
/* 25 */            this.I00iiO = iliiI1I00000oIO;
/* 29 */            IIOoi0ooOoO iIOoi0ooOoOI00lll10 = iIOoi0ooOoO.I00lll10(IIi0I0I0o.I01OooO0o0o);
/* 33 */            IIOo0liIi iIOo0liIiI000o00OoI0I = null;
/* 50 */            this.I00iio = iIOoi0ooOoOI00lll10 != null ? new OIll1lio(iIOoi0ooOoOI00lll10) : iliiI1I00000oIO != null ? l1lloOI01o1.I00000oIO(iliiI1I00000oIO) : null;
/* 60 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I0IiOioooo0i);
/* 64 */            if (iIOoOiOII00oII != null) {
                        try {
/* 68 */                    iIOo0liIiI000o00OoI0I = I000o00OoI0I(iIOoOiOII00oII);
/* 78 */                    if (iIOo0liIiI000o00OoI0I.I000O01llI0.isEmpty()) {
/* 96 */                        Log.w("PdfBox-Android", "Invalid ToUnicode CMap in font " + getName());
/* 99 */                        String str = iIOo0liIiI000o00OoI0I.I00000oOI;
/* 101 */                       str = str == null ? "" : str;
/* 107 */                       String str2 = iIOo0liIiI000o00OoI0I.I0000O;
/* 101 */                       String str3 = str2 != null ? str2 : "";
/* 114 */                       IIOoOiOI iIOoOiOII00oII2 = iIOoi0ooOoO.I00oII(IIi0I0I0o.I01O10iIoo1O);
/* 122 */                       if (str.contains("Identity") || str3.contains("Identity") || IIi0I0I0o.I01l00l.equals(iIOoOiOII00oII2) || IIi0I0I0o.I01l10Oi.equals(iIOoOiOII00oII2)) {
/* 153 */                           iIOo0liIiI000o00OoI0I = IIOo0oO0O1.I00000oIO(IIi0I0I0o.I01l00l.I00iOIl);
/* 159 */                           Log.w("PdfBox-Android", "Using predefined identity CMap instead");
                                }
                            }
                        } catch (IOException e) {
/* 181 */                   Log.e("PdfBox-Android", "Could not read ToUnicode CMap in font " + getName(), e);
                        }
                    }
/* 184 */           this.I00iiI = iIOo0liIiI000o00OoI0I;
                }

                public static IIOo0liIi I000o00OoI0I(IIOoOiOI iIOoOiOI) throws IOException {
/* 3 */             if (iIOoOiOI instanceof IIi0I0I0o) {
/* 9 */                 return IIOo0oO0O1.I00000oIO(((IIi0I0I0o) iIOoOiOI).I00iOIl);
                    }
/* 16 */            IIOooOII iIOooOIII010l1ol111 = null;
/* 17 */            if (!(iIOoOiOI instanceof IIi0io1lIo)) {
/* 60 */                IioIoO10iOiI.I000OOo1O("Expected Name or Stream");
/* 16 */                return null;
                    }
                    try {
/* 21 */                iIOooOIII010l1ol111 = ((IIi0io1lIo) iIOoOiOI).I010l1ol111();
/* 25 */                ConcurrentHashMap concurrentHashMap = IIOo0oO0O1.I00000oIO;
/* 30 */                IIOo1i iIOo1i = new IIOo1i(0);
/* 37 */                iIOo1i.I0000Il00O = new byte[Barcode.FORMAT_UPC_A];
/* 40 */                iIOo1i.I00000oOI = true;
/* 42 */                VarHandle.storeStoreFence();
/* 45 */                return iIOo1i.I000o00OoI0I(iIOooOIII010l1ol111);
                    } finally {
/* 54 */                io0iolo.I00000oOI(iIOooOIII010l1ol111);
                    }
                }

                @Override
                public O1OoooIi1Ol0 I00000oIO() {
/* 1 */             return I00l0I0l0lO1;
                }

                public float I0000O() {
                    float f;
                    float f2;
/* 1 */             float f3 = this.I00ilO0;
/* 6 */             if (f3 != 0.0f) {
/* 8 */                 return f3;
                    }
/* 13 */            IIOoIilO iIOoIilOI00lli11 = this.I00iOIl.I00lli11(IIi0I0I0o.I0Ili1Oio0I1);
/* 17 */            if (iIOoIilOI00lli11 != null) {
/* 20 */                f = 0.0f;
/* 21 */                f2 = 0.0f;
/* 28 */                for (int i = 0; i < iIOoIilOI00lli11.I00iOIl.size(); i++) {
/* 30 */                    IIOoOiOI iIOoOiOII00lll10 = iIOoIilOI00lli11.I00lll10(i);
/* 36 */                    if (iIOoOiOII00lll10 instanceof IIi0IoOo) {
/* 40 */                        float fI00ioIO = ((IIi0IoOo) iIOoOiOII00lll10).I00ioIO();
/* 46 */                        if (fI00ioIO > 0.0f) {
/* 48 */                            f += fI00ioIO;
/* 51 */                            f2 += 1.0f;
                                }
                            }
                        }
                    } else {
/* 55 */                f = 0.0f;
/* 56 */                f2 = 0.0f;
                    }
/* 61 */            float f4 = f > 0.0f ? f / f2 : 0.0f;
/* 63 */            this.I00ilO0 = f4;
/* 113 */           return f4;
                }

                public Ooo0OIOI I0000oI00(int i) {
/* 11 */            return new Ooo0OIOI(I000OiO(i) / 1000.0f, 0.0f);
                }

                public OIll1lio I0001Ioi1lo() {
/* 1 */             return this.I00iio;
                }

                public Ooo0OIOI I000II(int i) {
/* 49 */            throw new UnsupportedOperationException("Horizontal fonts have no position vector");
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:6:0x000e, B:8:0x001a, B:10:0x001f, B:14:0x002e, B:16:0x0035, B:18:0x003f, B:13:0x0028), top: B:23:0x000e }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I000O01llI0() {
/* 1 */             IIOo0liIi iIOo0liIi = this.I00iiI;
/* 3 */             float f = this.I00io1l;
/* 9 */             if (f != -1.0f) {
/* 113 */               return f;
                    }
/* 13 */            if (iIOo0liIi != null) {
                        try {
/* 15 */                    IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 25 */                    if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0IiOioooo0i)) {
/* 27 */                        int i = iIOo0liIi.I000l1;
/* 30 */                        if (i > -1) {
/* 36 */                            this.I00io1l = I000OiO(i);
                                }
                            } else {
/* 45 */                        this.I00io1l = I000OiO(32);
                            }
                        } catch (Exception e) {
/* 75 */                    Log.e("PdfBox-Android", "Can't determine the width of the space character, assuming 250", e);
/* 80 */                    this.I00io1l = 250.0f;
/* 78 */                    return 250.0f;
                        }
                    }
/* 47 */            float f2 = this.I00io1l;
/* 52 */            if (f2 > 0.0f) {
/* 70 */                return f2;
                    }
/* 54 */            float fI00000oOI = I00000oOI(32);
/* 58 */            this.I00io1l = fI00000oOI;
/* 62 */            if (fI00000oOI > 0.0f) {
/* 70 */                return fI00000oOI;
                    }
/* 64 */            float fI0000O = I0000O();
/* 68 */            this.I00io1l = fI0000O;
/* 70 */            return fI0000O;
                }

                public abstract float I000OOo1O(int i);

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public float I000OiO(int i) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 3 */             AbstractMap abstractMap = this.I00ioIO;
/* 13 */            Float f = (Float) abstractMap.get(Integer.valueOf(i));
/* 15 */            if (f != null) {
/* 17 */                return f.floatValue();
                    }
/* 28 */            if (iIOoi0ooOoO.I00oII(IIi0I0I0o.I0Ili1Oio0I1) == null) {
/* 38 */                if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I01oo0OOli)) {
/* 44 */                    int iI00oooO = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I01OiO1OI, null, -1);
/* 50 */                    int iI00oooO2 = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I01lolI0O, null, -1);
/* 58 */                    int size = I000iOII().size();
/* 62 */                    int i2 = i - iI00oooO;
/* 65 */                    if (size > 0 && i >= iI00oooO && i <= iI00oooO2 && i2 < size) {
/* 81 */                        Float fValueOf = (Float) I000iOII().get(i2);
/* 83 */                        if (fValueOf == null) {
/* 85 */                            fValueOf = Float.valueOf(0.0f);
                                }
/* 93 */                        abstractMap.put(Integer.valueOf(i), fValueOf);
/* 96 */                        return fValueOf.floatValue();
                            }
/* 101 */                   OIll1lio oIll1lioI0001Ioi1lo = I0001Ioi1lo();
/* 105 */                   if (oIll1lioI0001Ioi1lo != null) {
/* 111 */                       float fI00ooiO1I = oIll1lioI0001Ioi1lo.I00iOIl.I00ooiO1I(IIi0I0I0o.I01oo0OOli, 0.0f);
/* 123 */                       abstractMap.put(Integer.valueOf(i), Float.valueOf(fI00ooiO1I));
/* 126 */                       return fI00ooiO1I;
                            }
                        }
                    }
/* 131 */           if (I000l1()) {
/* 133 */               float fI000OOo1O = I000OOo1O(i);
/* 145 */               abstractMap.put(Integer.valueOf(i), Float.valueOf(fI000OOo1O));
/* 148 */               return fI000OOo1O;
                    }
/* 149 */           float fI00000oOI = I00000oOI(i);
/* 161 */           abstractMap.put(Integer.valueOf(i), Float.valueOf(fI00000oOI));
/* 186 */           return fI00000oOI;
                }

                public final List I000iOII() {
/* 1 */             List list = this.I00ilI0I1;
/* 3 */             if (list != null) {
/* 113 */               return list;
                    }
/* 9 */             IIOoIilO iIOoIilOI00lli11 = this.I00iOIl.I00lli11(IIi0I0I0o.I0Ili1Oio0I1);
/* 13 */            if (iIOoIilOI00lli11 == null) {
/* 90 */                List list2 = Collections.EMPTY_LIST;
/* 92 */                this.I00ilI0I1 = list2;
/* 113 */               return list2;
                    }
/* 15 */            ArrayList arrayList = iIOoIilOI00lli11.I00iOIl;
/* 23 */            ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 32 */            for (int i = 0; i < arrayList.size(); i++) {
/* 34 */                IIOoOiOI iIOoOiOII00lll10 = iIOoIilOI00lli11.I00lll10(i);
/* 40 */                if (iIOoOiOII00lll10 instanceof IIi0IoOo) {
/* 52 */                    arrayList2.add(Float.valueOf(((IIi0IoOo) iIOoOiOII00lll10).I00ioIO()));
                        } else {
/* 57 */                    arrayList2.add(null);
                        }
                    }
/* 65 */            IIOoOOOol iIOoOOOol = new IIOoOOOol();
/* 68 */            iIOoOOOol.I00iiO = false;
/* 70 */            iIOoOOOol.I00iiI = arrayList2;
/* 72 */            iIOoOOOol.I00iOIl = iIOoIilOI00lli11;
/* 82 */            if (arrayList2.size() != arrayList.size()) {
/* 85 */                iIOoOOOol.I00iiO = true;
                    }
/* 87 */            this.I00ilI0I1 = iIOoOOOol;
/* 89 */            return iIOoOOOol;
                }

                public abstract boolean I000l1();

                public abstract boolean I000lI();

                public abstract int I000oI1ioi(ByteArrayInputStream byteArrayInputStream);

                public String I00100l0(int i) {
/* 1 */             IIOo0liIi iIOo0liIi = this.I00iiI;
/* 3 */             if (iIOo0liIi == null) {
/* 61 */                return null;
                    }
/* 5 */             HashMap map = iIOo0liIi.I000O01llI0;
/* 7 */             String str = iIOo0liIi.I00000oOI;
                    return (str != null && str.startsWith("Identity-") && ((this.I00iOIl.I00oII(IIi0I0I0o.I0IiOioooo0i) instanceof IIi0I0I0o) || map.isEmpty())) ? new String(new char[]{(char) i}) : (String) map.get(Integer.valueOf(i));
                }

                public String I00100o1O0lo(int i, Io0O0o0l1o io0O0o0l1o) {
/* 1 */             return I00100l0(i);
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIll100) && ((OIll100) obj).I00iOIl == this.I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public String toString() {
/* 26 */            return getClass().getSimpleName() + " " + getName();
                }
            }
