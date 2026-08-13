            package p000;

            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class II01i0o0oO implements Function1 {
                public final int I00iOIl;
                public II0IOO1i I00iiI;
                public II00Ol1Ii I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 11 */            int i2 = 0;
/* 13 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 311 */                   this.I00iiI.I000OiO(this.I00iiO.I00000oIO, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
/* 162 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 166 */                   II0IOO1i iI0IOO1i = this.I00iiI;
/* 170 */                   String str = this.I00iiO.I00000oIO;
/* 172 */                   OlO0OIIl1 olO0OIIl1 = iI0IOO1i.I0000O;
/* 186 */                   ArrayList arrayList = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 189 */                   Iterator it = arrayList.iterator();
                            while (true) {
/* 197 */                       if (!it.hasNext()) {
/* 217 */                           i2 = -1;
                                } else if (!O0000Ioio00.I0000O(((II00Ol1Ii) it.next()).I00000oIO, str)) {
/* 214 */                           i2++;
                                }
                            }
/* 218 */                   if (i2 == -1) {
/* 293 */                       Log.w("AGBenchmarkVM", "Benchmark result with id " + str + " not found.");
                                break;
                            } else {
/* 236 */                       arrayList.set(i2, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList.get(i2), false, zBooleanValue, false, null, 55));
                                while (true) {
/* 239 */                           Object value = olO0OIIl1.getValue();
/* 258 */                           ArrayList arrayList2 = arrayList;
/* 273 */                           if (olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList2, null, false, false, 0, 0, null, 126))) {
                                        break;
                                    } else {
/* 276 */                               arrayList = arrayList2;
                                    }
                                }
                            }
                        default:
/* 22 */                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 26 */                    II0IOO1i iI0IOO1i2 = this.I00iiI;
/* 30 */                    String str2 = this.I00iiO.I00000oIO;
/* 32 */                    OlO0OIIl1 olO0OIIl12 = iI0IOO1i2.I0000O;
/* 46 */                    ArrayList arrayList3 = new ArrayList(((II0I0ili0) olO0OIIl12.getValue()).I00000oIO);
/* 49 */                    Iterator it2 = arrayList3.iterator();
                            while (true) {
/* 57 */                        if (!it2.hasNext()) {
/* 77 */                            i2 = -1;
                                } else if (!O0000Ioio00.I0000O(((II00Ol1Ii) it2.next()).I00000oIO, str2)) {
/* 74 */                            i2++;
                                }
                            }
/* 78 */                    if (i2 == -1) {
/* 154 */                       Log.w("AGBenchmarkVM", "Benchmark result with id " + str2 + " not found.");
                                break;
                            } else {
/* 96 */                        arrayList3.set(i2, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList3.get(i2), false, false, zBooleanValue2, null, 47));
                                while (true) {
/* 99 */                            Object value2 = olO0OIIl12.getValue();
/* 117 */                           ArrayList arrayList4 = arrayList3;
/* 134 */                           if (olO0OIIl12.I000iOII(value2, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl12.getValue(), arrayList4, null, false, false, 0, 0, null, 126))) {
                                        break;
                                    } else {
/* 137 */                               arrayList3 = arrayList4;
                                    }
                                }
                            }
                    }
/* 157 */           return ooiIlOl1iI;
                }
            }
