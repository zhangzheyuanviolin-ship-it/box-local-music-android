            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I10ill1 extends O0iO10011II implements IlliIl1l11O {
                public final Object I00iOIl;
                public final OoI1Oi0l1I0o I00iiI;
                public final Ol1o0O0O0 I00iiO;
                public final OO0iol0 I00iio;
                public final Function1 I00ilI0I1;
                public final I10llI0II11l I00ilO0;
                public final IOii1l I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10ill1(Object obj, OoI1Oi0l1I0o ooI1Oi0l1I0o, Ol1o0O0O0 ol1o0O0O0, OO0iol0 oO0iol0, Function1 function1, I10llI0II11l i10llI0II11l, IOii1l iOii1l) {
/* 16 */            super(2);
/* 1 */             this.I00iOIl = obj;
/* 3 */             this.I00iiI = ooI1Oi0l1I0o;
/* 5 */             this.I00iiO = ol1o0O0O0;
/* 7 */             this.I00iio = oO0iol0;
/* 9 */             this.I00ilI0I1 = function1;
/* 11 */            this.I00ilO0 = i10llI0II11l;
/* 13 */            this.I00io1l = iOii1l;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int iIndexOf;
/* 5 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 11 */            int iIntValue = ((Number) obj2).intValue();
/* 30 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 32 */                OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00iiI;
/* 34 */                OIooliIO0 oIooliIO0 = ooI1Oi0l1I0o.I0000oI00;
/* 36 */                OIooliIO0 oIooliIO02 = ooI1Oi0l1I0o.I0000O;
/* 38 */                Object value = oIooliIO0.getValue();
/* 42 */                Object obj3 = this.I00iOIl;
/* 48 */                boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(O0000Ioio00.I0000O(obj3, value));
/* 52 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 56 */                Function1 function1 = this.I00ilI0I1;
/* 58 */                OO0iol0 oO0iol0 = this.I00iio;
/* 60 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 62 */                I10llI0II11l i10llI0II11l = this.I00ilO0;
/* 64 */                if (zI000O01llI0 || objI00O0i0ii == iOO0o0I1l) {
/* 140 */                   objI00O0i0ii = (!O0000Ioio00.I0000O(obj3, oIooliIO0.getValue()) || oO0iol0 == null) ? (O0000Ioio00.I0000O(obj3, ooI1Oi0l1I0o.I0001Ioi1lo().I00000oOI()) || O0000Ioio00.I0000O(obj3, ooI1Oi0l1I0o.I0001Ioi1lo().I0000oI00())) ? (IOoOi11Io0o) function1.invoke(i10llI0II11l) : (IOoOi11Io0o) function1.invoke(new OO0iol0(i10llI0II11l, ooI1Oi0l1I0o.I0001Ioi1lo().I00000oOI(), obj3)) : (IOoOi11Io0o) function1.invoke(oO0iol0);
/* 143 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 146 */               IOoOi11Io0o iOoOi11Io0o = (IOoOi11Io0o) objI00O0i0ii;
/* 176 */               boolean zI000O01llI02 = iloI0lOlll1.I000O01llI0(O0000Ioio00.I0000O(ooI1Oi0l1I0o.I0001Ioi1lo().I0000oI00(), obj3)) | iloI0lOlll1.I000O01llI0(O0000Ioio00.I0000O(obj3, oIooliIO0.getValue()));
/* 177 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 181 */               if (zI000O01llI02 || objI00O0i0ii2 == iOO0o0I1l) {
/* 272 */                   objI00O0i0ii2 = (O0000Ioio00.I0000O(ooI1Oi0l1I0o.I0001Ioi1lo().I0000oI00(), obj3) || (O0000Ioio00.I0000O(obj3, oIooliIO0.getValue()) && oO0iol0 != null)) ? Il1OOloOIl1.I00000oOI : (O0000Ioio00.I0000O(obj3, ooI1Oi0l1I0o.I0001Ioi1lo().I00000oOI()) || O0000Ioio00.I0000O(obj3, ooI1Oi0l1I0o.I0001Ioi1lo().I0000oI00())) ? ((IOoOi11Io0o) function1.invoke(i10llI0II11l)).I00000oOI : ((IOoOi11Io0o) function1.invoke(new OO0iol0(i10llI0II11l, obj3, ooI1Oi0l1I0o.I0001Ioi1lo().I00000oOI()))).I00000oOI;
/* 275 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 279 */               Il1OOloOIl1 il1OOloOIl1 = (Il1OOloOIl1) objI00O0i0ii2;
/* 281 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 285 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 293 */                   boolean zI0000O = O0000Ioio00.I0000O(obj3, oIooliIO02.getValue());
/* 297 */                   I10l1ooOi i10l1ooOi = new I10l1ooOi();
/* 308 */                   i10l1ooOi.I00000oIO = lOO00IiI0li.I00000oIO(Boolean.valueOf(zI0000O));
/* 316 */                   i10l1ooOi.I00000oOI = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 318 */                   VarHandle.storeStoreFence();
/* 321 */                   iloI0lOlll1.I00iio(i10l1ooOi);
                            obj4 = i10l1ooOi;
                        }
/* 324 */               I10l1ooOi i10l1ooOi2 = (I10l1ooOi) obj4;
/* 327 */               Il0l0iooI il0l0iooI = iOoOi11Io0o.I00000oIO;
/* 333 */               float fI000II = iOoOi11Io0o.I0000Il00O.I000II();
/* 337 */               i0I0I1I011I i0i0i1i011i = new i0I0I1I011I();
/* 340 */               i0i0i1i011i.I00000oIO = fI000II;
/* 342 */               i0i0i1i011i.I00000oOI = obj3;
/* 344 */               VarHandle.storeStoreFence();
/* 361 */               i10l1ooOi2.I00000oIO.setValue(Boolean.valueOf(O0000Ioio00.I0000O(obj3, oIooliIO02.getValue())));
/* 405 */               i10l1ooOi2.I00000oOI.setValue(Boolean.valueOf((!O0000Ioio00.I0000O(obj3, oIooliIO0.getValue()) || O0000Ioio00.I0000O(obj3, oIooliIO02.getValue()) || O0000Ioio00.I0000O(obj3, ooI1Oi0l1I0o.I00000oIO.I00olI())) ? false : true));
/* 408 */               O1ooiI111i o1ooiI111iI0000O = i0i0i1i011i.I0000O(i10l1ooOi2);
/* 412 */               boolean z = ooI1Oi0l1I0o instanceof IiIOol1l0000;
/* 414 */               Ol1o0O0O0 ol1o0O0O0 = this.I00iiO;
/* 416 */               boolean z2 = z && (iIndexOf = ol1o0O0O0.indexOf(obj3)) >= 0 && iIndexOf >= ol1o0O0O0.size() + (-3);
/* 434 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj3);
/* 438 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 442 */               if (zI000OOo1O || objI00O0i0ii4 == iOO0o0I1l) {
/* 448 */                   objI00O0i0ii4 = new I10iOo0il1(obj3, 0);
/* 451 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 455 */               Function1 function12 = (Function1) objI00O0i0ii4;
/* 457 */               boolean zI000II = iloI0lOlll1.I000II(il1OOloOIl1);
/* 461 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 465 */               if (zI000II || objI00O0i0ii5 == iOO0o0I1l) {
/* 471 */                   objI00O0i0ii5 = new I10iiOoIOii(il1OOloOIl1);
/* 474 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 508 */               O1OooO0IlOo.I00000oIO(this.I00iiI, function12, o1ooiI111iI0000O, il0l0iooI, il1OOloOIl1, (IlliIl1l11O) objI00O0i0ii5, z2, iiioOl1O.I00000oOI(-519005224, new I10il0oO(obj3, ol1o0O0O0, i10llI0II11l, this.I00io1l, 0), iloI0lOlll1), iloI0lOlll1, 805306368, 64);
                    } else {
/* 512 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 515 */           return OoiIlOl1iI.I00000oIO;
                }
            }
