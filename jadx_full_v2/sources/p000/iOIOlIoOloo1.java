            package p000;

            import android.content.Context;
            import android.net.Uri;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOIOlIoOloo1 {
                public static final void I00000oIO(Ol0o1OiOIIIl ol0o1OiOIIIl, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    int i4;
/* 14 */            iloI0lOlll1.I00i0O(-1136245085);
/* 20 */            int i5 = 2;
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i2 = (iloI0lOlll1.I000OOo1O(ol0o1OiOIIIl) ? 4 : 2) | i;
                    } else {
/* 34 */                i2 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 66 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 71 */            int i6 = 0;
/* 83 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 87 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(ol0o1OiOIIIl.I0000oI00, iloI0lOlll1);
/* 97 */                boolean z = ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I0000Il00O;
/* 105 */               String str = ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I0000O;
/* 113 */               Uri uri = ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I0000oI00;
/* 115 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 119 */               Object obj = IOl11li.I00000oIO;
/* 121 */               if (objI00O0i0ii == obj) {
/* 125 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 129 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 132 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 140 */               Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 144 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i5);
/* 147 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ol0o1OiOIIIl);
/* 151 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 155 */               if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 161 */                   IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(4);
/* 164 */                   iIOIlOoI111.I00iiI = ol0o1OiOIIIl;
/* 166 */                   VarHandle.storeStoreFence();
/* 169 */                   iloI0lOlll1.I00iio(iIOIlOoI111);
                            obj2 = iIOIlOoI111;
                        }
/* 174 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll1, 0);
/* 180 */               I0O11lO0IoO i0O11lO0IoO = new I0O11lO0IoO(i6);
/* 183 */               i0O11lO0IoO.I00iiI = z;
/* 185 */               i0O11lO0IoO.I00iiO = str;
/* 187 */               i0O11lO0IoO.I00iio = o1OIi1I00000oIO;
/* 189 */               i0O11lO0IoO.I00ilI0I1 = uri;
/* 191 */               i0O11lO0IoO.I00ilO0 = context;
/* 193 */               i0O11lO0IoO.I00io1l = illOOo00lI;
/* 195 */               i0O11lO0IoO.I00l0I0l0lO1 = ol0o1OiOIIIl;
/* 197 */               i0O11lO0IoO.I00ioIO = illOOo00lI2;
/* 199 */               i0O11lO0IoO.I00l0OO0IO = oI10i0Il;
/* 201 */               VarHandle.storeStoreFence();
/* 219 */               iOIlI11IO.I00000oIO(illOOo00lI, null, iiioOl1O.I00000oOI(435154170, i0O11lO0IoO, iloI0lOlll1), iloI0lOlll1, ((i2 >> 3) & 14) | 384, 2);
/* 232 */               if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 237 */                   iloI0lOlll1.I00i01iIIliI(-1235186662);
/* 240 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                            Object obj3 = objI00O0i0ii3;
/* 244 */                   if (objI00O0i0ii3 == obj) {
/* 250 */                       I0Il0000oli i0Il0000oli = new I0Il0000oli(20);
/* 253 */                       i0Il0000oli.I00iiI = oI10i0Il;
/* 255 */                       VarHandle.storeStoreFence();
/* 258 */                       iloI0lOlll1.I00iio(i0Il0000oli);
                                obj3 = i0Il0000oli;
                            }
/* 266 */                   O11iol o11iol = new O11iol(2);
/* 269 */                   o11iol.I00iiI = ol0o1OiOIIIl;
/* 271 */                   o11iol.I00iiO = illOOo00lI;
/* 273 */                   o11iol.I00iio = illOOo00lI2;
/* 275 */                   o11iol.I00ilI0I1 = oI10i0Il;
/* 277 */                   VarHandle.storeStoreFence();
/* 283 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(26715510, o11iol, iloI0lOlll1);
/* 291 */                   I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(11);
/* 294 */                   i0Il1IoilolI.I00iiI = oI10i0Il;
/* 296 */                   VarHandle.storeStoreFence();
/* 319 */                   i4 = 1;
/* 333 */                   i3 = i;
/* 337 */                   iOIil10l.I00000oIO((IllOOo00lI) obj3, iOii1lI00000oOI, null, iiioOl1O.I00000oOI(240332596, i0Il1IoilolI, iloI0lOlll1), null, i1O1ll.I0001Ioi1lo, i1O1ll.I000II, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 340 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 344 */                   i3 = i;
/* 346 */                   i4 = 1;
/* 350 */                   iloI0lOlll1.I00i01iIIliI(-1234351553);
/* 353 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    } else {
/* 357 */               i3 = i;
/* 358 */               i4 = 1;
/* 359 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 362 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 366 */           if (oOloioIlI001IO000 != null) {
/* 370 */               I0O10I0O i0o10i0o = new I0O10I0O(i4);
/* 373 */               i0o10i0o.I00iiI = ol0o1OiOIIIl;
/* 375 */               i0o10i0o.I00iiO = illOOo00lI;
/* 377 */               i0o10i0o.I00iio = illOOo00lI2;
/* 379 */               i0o10i0o.I00ilI0I1 = i3;
/* 381 */               VarHandle.storeStoreFence();
/* 384 */               oOloioIlI001IO000.I0000O = i0o10i0o;
                    }
                }
            }
