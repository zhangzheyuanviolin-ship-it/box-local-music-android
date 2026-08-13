            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iOiOl0Oi0 implements liI0OilOI1I1 {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public iOiOl0Oi0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
/* 3 */             boolean z = false;
/* 5 */             int i = 1;
                    switch (this.I00000oIO) {
                        case 0:
/* 216 */                   iOil1lO10l ioil1lo10l = (iOil1lO10l) this.I00000oOI;
/* 220 */                   o0oOOOIlO o0ooooilo = (o0oOOOIlO) this.I0000Il00O;
/* 228 */                   Oi0Oooi oi0Oooi = new Oi0Oooi(28, z);
/* 231 */                   oi0Oooi.I00iiI = o0ooooilo;
/* 233 */                   VarHandle.storeStoreFence();
/* 236 */                   l00Iil l00iil = ioil1lo10l.I00iOIl;
/* 238 */                   li10Io11 li10io11I00000oIO = l00iil.I00000oIO();
/* 244 */                   iOii0lO0 ioii0lo0 = new iOii0lO0(i);
/* 247 */                   ioii0lo0.I00000oOI = l00iil;
/* 249 */                   ioii0lo0.I0000Il00O = (ilOiOOII0I0) obj;
/* 251 */                   ioii0lo0.I0000O = oi0Oooi;
/* 253 */                   VarHandle.storeStoreFence();
/* 258 */                   return ll0li01oO0li.I0000Il00O(li10io11I00000oIO, ioii0lo0, l00iil.I00iOIl);
                        case 1:
/* 179 */                   ioii01Ii100 ioii01ii100 = (ioii01Ii100) obj;
                            try {
/* 181 */                       Object objI000O01llI0 = ((iOiiOlio) this.I00000oOI).I000O01llI0(this.I0000Il00O, null);
/* 185 */                       liIOoOi1Ii1 liioooi1ii1I0001Ioi1lo = ioii01ii100.I0001Ioi1lo();
/* 191 */                       ioIl010 ioil010 = new ioIl010(i);
/* 194 */                       ioil010.I00000oOI = ioii01ii100;
/* 196 */                       ioil010.I0000Il00O = objI000O01llI0;
/* 198 */                       VarHandle.storeStoreFence();
/* 203 */                       return ll0li01oO0li.I0000Il00O(liioooi1ii1I0001Ioi1lo, ioil010, ioii01ii100.I0000O);
                            } catch (GenAiException e) {
/* 209 */                       return ll0li01oO0li.I00000oOI(e);
                            }
                        default:
/* 11 */                    ioii01Ii100 ioii01ii1002 = (ioii01Ii100) this.I00000oOI;
/* 15 */                    ili0l0oo0 ili0l0oo0Var = (ili0l0oo0) this.I0000Il00O;
/* 17 */                    Integer num = (Integer) obj;
/* 19 */                    Executor executor = ioii01ii1002.I0000oI00;
/* 21 */                    ilOiOOII0I0 iloiooii0i0 = ioii01ii1002.I00000oOI;
/* 23 */                    int iIntValue = num.intValue();
/* 27 */                    if (iIntValue == 0) {
/* 154 */                       ilIoOl ilioolI00000oIO = ilIoOl.I00000oIO(0, null, "Feature is unavailable.");
/* 165 */                       executor.execute(new Iioo110oI(15));
/* 168 */                       return ll0li01oO0li.I00000oOI(ilioolI00000oIO);
                            }
/* 29 */                    if (iIntValue == 1 || iIntValue == 2) {
/* 125 */                       l00Iil l00iil2 = ioii01ii1002.I00000oIO;
/* 127 */                       li10Io11 li10io11I00000oIO2 = l00iil2.I00000oIO();
/* 133 */                       iOii0lO0 ioii0lo02 = new iOii0lO0(i);
/* 136 */                       ioii0lo02.I00000oOI = l00iil2;
/* 138 */                       ioii0lo02.I0000Il00O = iloiooii0i0;
/* 140 */                       ioii0lo02.I0000O = ili0l0oo0Var;
/* 142 */                       VarHandle.storeStoreFence();
/* 147 */                       return ll0li01oO0li.I0000Il00O(li10io11I00000oIO2, ioii0lo02, l00iil2.I00iOIl);
                            }
/* 35 */                    if (iIntValue != 3) {
/* 49 */                        new StringBuilder(String.valueOf(num).length() + 27);
/* 66 */                        return ll0li01oO0li.I00000oOI(ilIoOl.I00000oIO(0, null, "Unexpected feature status: ".concat(String.valueOf(num))));
                            }
/* 71 */                    String str = iloiooii0i0.I00000oIO;
/* 81 */                    StringBuilder sb = new StringBuilder(str.length() + 33);
/* 86 */                    sb.append("Feature ");
/* 89 */                    sb.append(str);
/* 94 */                    sb.append(" is downloaded and ready.");
/* 103 */                   Log.i("ioii01Ii100", sb.toString());
/* 109 */                   l0iOoII1Il l0iooii1il = new l0iOoII1Il(6);
/* 112 */                   l0iooii1il.I00iiI = ioii01ii1002;
/* 114 */                   l0iooii1il.I00iiO = ili0l0oo0Var;
/* 116 */                   VarHandle.storeStoreFence();
/* 119 */                   executor.execute(l0iooii1il);
/* 122 */                   return lii1I01.I00iiI;
                    }
                }
            }
