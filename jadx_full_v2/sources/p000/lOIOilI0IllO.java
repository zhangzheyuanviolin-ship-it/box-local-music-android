            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOIOilI0IllO {
                /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(int i, List list, Function1 function1, float f, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
/* 4 */             iloI0lOlll1.I00i0O(-1130591255);
/* 10 */            if ((i2 & 6) == 0) {
/* 21 */                i3 = (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | i2;
                    } else {
/* 23 */                i3 = i2;
                    }
/* 26 */            if ((i2 & 48) == 0) {
/* 39 */                i3 |= iloI0lOlll1.I000OOo1O(list) ? 32 : 16;
                    }
/* 44 */            if ((i2 & 384) == 0) {
/* 56 */                i3 |= iloI0lOlll1.I000OOo1O(function1) ? 256 : Barcode.FORMAT_ITF;
                    }
/* 61 */            if ((i2 & 3072) == 0) {
/* 73 */                i3 |= iloI0lOlll1.I0000O(f) ? 2048 : Barcode.FORMAT_UPC_E;
                    }
/* 76 */            if ((i2 & 24576) == 0) {
/* 89 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 16384 : 8192;
                    }
/* 94 */            if ((i3 & 9363) == 9362 && iloI0lOlll1.I00IO1()) {
/* 103 */               iloI0lOlll1.I00OilO00Il();
                    } else {
/* 110 */               iloI0lOlll1.I00i01iIIliI(802039891);
/* 119 */               int i4 = 1;
/* 142 */               boolean zI000OOo1O = ((i3 & 14) == 4) | iloI0lOlll1.I000OOo1O(list) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
/* 143 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 147 */               if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 151 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 155 */                       OiiI1OiIoo oiiI1OiIoo = new OiiI1OiIoo(i4);
/* 158 */                       oiiI1OiIoo.I00iiI = i;
/* 160 */                       oiiI1OiIoo.I00iio = list;
/* 162 */                       oiiI1OiIoo.I00iiO = f;
/* 164 */                       oiiI1OiIoo.I00ilI0I1 = function1;
/* 166 */                       VarHandle.storeStoreFence();
/* 169 */                       iloI0lOlll1.I00iio(oiiI1OiIoo);
                                obj = oiiI1OiIoo;
                            }
/* 174 */                   iloI0lOlll1.I0010I0i(false);
/* 181 */                   Oli1lii10.I00000oIO(o1ooiI111i, (IlliIl1l11O) obj, iloI0lOlll1, (i3 >> 12) & 14, 0);
                        }
                    }
/* 184 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 188 */           if (oOloioIlI001IO000 != null) {
/* 192 */               Ol0O00O0l ol0O00O0l = new Ol0O00O0l();
/* 195 */               ol0O00O0l.I00iOIl = i;
/* 197 */               ol0O00O0l.I00iiI = list;
/* 199 */               ol0O00O0l.I00iiO = function1;
/* 201 */               ol0O00O0l.I00iio = f;
/* 203 */               ol0O00O0l.I00ilI0I1 = o1ooiI111i;
/* 205 */               ol0O00O0l.I00ilO0 = i2;
/* 207 */               VarHandle.storeStoreFence();
/* 210 */               oOloioIlI001IO000.I0000O = ol0O00O0l;
                    }
                }
            }
