            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0IOO1i;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class II0IOO1i extends OooioIIoi0O {
                public Context I00000oOI;
                public Ii1liIllli0 I0000Il00O;
                public OlO0OIIl1 I0000O;
                public OOli1O I0000oI00;

                public static Ooo010llO I0000oI00(ArrayList arrayList) {
/* 5 */             if (arrayList.isEmpty()) {
/* 7 */                 return Ooo010llO.I00111O();
                    }
/* 12 */            List listI00Ol10 = IOOi0Ool1i.I00Ol10(arrayList);
/* 16 */            int size = listI00Ol10.size();
/* 26 */            double dDoubleValue = ((Number) IOOi0Ool1i.I001lllioOl(listI00Ol10)).doubleValue();
/* 36 */            double dDoubleValue2 = ((Number) IOOi0Ool1i.I00Io1o110i(listI00Ol10)).doubleValue();
/* 40 */            Iterator it = arrayList.iterator();
/* 44 */            double dDoubleValue3 = 0.0d;
/* 46 */            int i = 0;
/* 51 */            while (it.hasNext()) {
/* 63 */                dDoubleValue3 += ((Number) it.next()).doubleValue();
/* 64 */                i++;
/* 66 */                if (i < 0) {
/* 69 */                    IOOi1I.I000l1();
/* 73 */                    throw null;
                        }
                    }
/* 80 */            double d = i == 0 ? Double.NaN : dDoubleValue3 / i;
/* 84 */            double dI0001Ioi1lo = I0001Ioi1lo(size, listI00Ol10, 0.5d);
/* 90 */            double dI0001Ioi1lo2 = I0001Ioi1lo(size, listI00Ol10, 0.25d);
/* 96 */            double dI0001Ioi1lo3 = I0001Ioi1lo(size, listI00Ol10, 0.75d);
/* 100 */           Ooo010IiioI ooo010IiioII001l0I00 = Ooo010llO.I001l0I00();
/* 104 */           ooo010IiioII001l0I00.I0000O();
/* 111 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I0010I0i(arrayList);
/* 114 */           ooo010IiioII001l0I00.I0000O();
/* 121 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I00II0Ol1O0l(dDoubleValue);
/* 124 */           ooo010IiioII001l0I00.I0000O();
/* 131 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I001lllioOl(dDoubleValue2);
/* 134 */           ooo010IiioII001l0I00.I0000O();
/* 141 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I001lIiIIo1O(d);
/* 144 */           ooo010IiioII001l0I00.I0000O();
/* 151 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I001lloI(dI0001Ioi1lo);
/* 154 */           ooo010IiioII001l0I00.I0000O();
/* 161 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I00II0oii1o(dI0001Ioi1lo2);
/* 164 */           ooo010IiioII001l0I00.I0000O();
/* 171 */           ((Ooo010llO) ooo010IiioII001l0I00.I00iiI).I00IO1(dI0001Ioi1lo3);
/* 178 */           return (Ooo010llO) ooo010IiioII001l0I00.I00000oOI();
                }

                public static final double I0001Ioi1lo(int i, List list, double d) {
/* 2 */             if (i == 1) {
/* 11 */                return ((Number) list.get(0)).doubleValue();
                    }
/* 18 */            double d2 = d * (i - 1);
/* 23 */            int iFloor = (int) Math.floor(d2);
/* 28 */            int iCeil = (int) Math.ceil(d2);
/* 29 */            if (iFloor == iCeil) {
/* 37 */                return ((Number) list.get(iFloor)).doubleValue();
                    }
/* 43 */            double d3 = d2 - iFloor;
/* 69 */            return (((Number) list.get(iCeil)).doubleValue() * d3) + ((1.0d - d3) * ((Number) list.get(iFloor)).doubleValue());
                }

                public final void I000II() {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 34 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 34 */            } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, false, 0, 0, null, 125)));
                }

                public final void I000O01llI0() {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 15 */            ArrayList arrayList = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 18 */            int size = arrayList.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 42 */                arrayList.set(i, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList.get(i), false, false, false, null, 35));
                    }
/* 77 */            do {
/* 48 */                value = olO0OIIl1.getValue();
/* 77 */            } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList, null, false, false, 0, 0, null, 126)));
                }

                public final void I000OOo1O(String str) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 25 */                String str2 = str;
/* 34 */                if (olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, false, 0, 0, str2, 63))) {
/* 36 */                    return;
                        } else {
/* 37 */                    str = str2;
                        }
                    }
                }

                public final void I000OiO(String str, boolean z) {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 15 */            ArrayList arrayList = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 18 */            Iterator it = arrayList.iterator();
/* 22 */            int i = 0;
                    while (true) {
/* 28 */                if (!it.hasNext()) {
/* 48 */                    i = -1;
                            break;
                        } else if (O0000Ioio00.I0000O(((II00Ol1Ii) it.next()).I00000oIO, str)) {
                            break;
                        } else {
/* 45 */                    i++;
                        }
                    }
/* 49 */            if (i != -1) {
/* 68 */                arrayList.set(i, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList.get(i), z, z, z, null, 35));
/* 101 */               do {
/* 71 */                    value = olO0OIIl1.getValue();
/* 101 */               } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList, null, false, false, 0, 0, null, 126)));
/* 103 */               return;
                    }
/* 125 */           Log.w("AGBenchmarkVM", "Benchmark result with id " + str + " not found.");
                }

                public final void I000iOII(int i) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 25 */                int i2 = i;
/* 34 */                if (olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, false, 0, i2, null, 95))) {
/* 36 */                    return;
                        } else {
/* 37 */                    i = i2;
                        }
                    }
                }

                public final void I000l1(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 25 */                boolean z2 = z;
/* 34 */                if (olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, z2, 0, 0, null, 119))) {
/* 36 */                    return;
                        } else {
/* 37 */                    z = z2;
                        }
                    }
                }

                public final void I000lI(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 25 */                boolean z2 = z;
/* 34 */                if (olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, z2, false, 0, 0, null, 123))) {
/* 36 */                    return;
                        } else {
/* 37 */                    z = z2;
                        }
                    }
                }
            }
