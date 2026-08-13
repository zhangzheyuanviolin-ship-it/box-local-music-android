            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.speech.tts.Voice;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class II01l10oli1 implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public II01l10oli1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Object value;
                    Object value2;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 0;
                    switch (i) {
                        case 0:
/* 67 */                    this.I00iiI.setValue(Boolean.FALSE);
/* 72 */                    II0IOO1i iI0IOO1i = (II0IOO1i) this.I00iiO;
/* 78 */                    String str = ((II00Ol1Ii) this.I00iio).I00000oIO;
/* 83 */                    I0iiIiI1 i0iiIiI1 = (I0iiIiI1) this.I00ilI0I1;
/* 85 */                    OlO0OIIl1 olO0OIIl1 = iI0IOO1i.I0000O;
/* 99 */                    ArrayList arrayList = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 102 */                   Iterator it = arrayList.iterator();
                            while (true) {
/* 110 */                       if (!it.hasNext()) {
/* 130 */                           i2 = -1;
                                } else if (!O0000Ioio00.I0000O(((II00Ol1Ii) it.next()).I00000oIO, str)) {
/* 127 */                           i2++;
                                }
                            }
/* 131 */                   if (i2 >= 0) {
/* 149 */                       arrayList.set(i2, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList.get(i2), false, false, false, i0iiIiI1, 31));
/* 162 */                       II00Ol1Ii iI00Ol1Ii = ((II0I0ili0) iI0IOO1i.I0000oI00.I00iOIl.getValue()).I00000oOI;
/* 182 */                       if (O0000Ioio00.I0000O(iI00Ol1Ii != null ? iI00Ol1Ii.I00000oIO : null, ((II00Ol1Ii) arrayList.get(i2)).I00000oIO)) {
/* 225 */                           do {
/* 184 */                               value2 = olO0OIIl1.getValue();
/* 225 */                           } while (!olO0OIIl1.I000iOII(value2, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, (II00Ol1Ii) arrayList.get(i2), false, false, 0, 0, null, 125)));
                                }
                            }
/* 259 */                   do {
/* 227 */                       value = olO0OIIl1.getValue();
/* 259 */                   } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList, null, false, false, 0, 0, null, 126)));
                        default:
/* 21 */                    SharedPreferences.Editor editorEdit = ((Context) this.I00iiO).getSharedPreferences("box_settings", 0).edit();
/* 27 */                    Voice voice = (Voice) this.I00iio;
/* 39 */                    editorEdit.putString("tts_voice_name", voice.getName()).apply();
/* 48 */                    this.I00iiI.setValue(voice.getName());
/* 53 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 55 */                    List list = OioIlii1iOO.I00000oIO;
/* 59 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                    }
/* 62 */            return ooiIlOl1iI;
                }
            }
