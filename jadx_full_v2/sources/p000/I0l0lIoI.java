            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class I0l0lIoI implements IlOil1iooOO0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I0l0lIoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
                
                    if (r3.invoke(r5, r1) == r2) goto L52;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
                
                    r9 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
                
                    if (r9.invoke(r11, r1) == r2) goto L52;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oIO(OillO0lO1O oillO0lO1O, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OlOi110lOOi olOi110lOOi;
                    Object objI00000oIO;
                    Object obj;
                    Throwable thI00000oOI;
/* 3 */             Ii10ioolOI ii10ioolOI = (Ii10ioolOI) this.I00iiI;
/* 7 */             if (iOoil1iiIilo instanceof OlOi110lOOi) {
/* 10 */                olOi110lOOi = (OlOi110lOOi) iOoil1iiIilo;
/* 12 */                int i = olOi110lOOi.I00ilI0I1;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    olOi110lOOi.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    olOi110lOOi = new OlOi110lOOi(this, iOoil1iiIilo);
                        }
                    }
/* 29 */            Object obj2 = olOi110lOOi.I00iiO;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = olOi110lOOi.I00ilI0I1;
/* 38 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(obj2);
/* 64 */                String str = oillO0lO1O.I0000Il00O;
/* 66 */                String str2 = oillO0lO1O.I00000oIO;
/* 68 */                if (str != null) {
/* 72 */                    Function1 function1 = (Function1) this.I00iiO;
/* 74 */                    ii10ioolOI.I000lI = str;
/* 76 */                    if (function1 != null) {
/* 78 */                        function1.invoke(str);
                            }
                        }
/* 81 */                O0Iioo1lO0o o0Iioo1lO0o = OlOiOI1oII1.I00000oIO;
/* 86 */                OlOi0iollo olOi0iollo = new OlOi0iollo(0);
/* 89 */                olOi0iollo.I00iiI = oillO0lO1O;
/* 91 */                VarHandle.storeStoreFence();
/* 94 */                o0Iioo1lO0o.I00000oOI(olOi0iollo);
/* 97 */                String str3 = oillO0lO1O.I00000oOI;
/* 99 */                if (str3 == null || str3.equals("message")) {
/* 132 */                   if (str2 != null) {
/* 138 */                       String str4 = str2.length() > 0 ? str2 : null;
/* 141 */                       if (str4 != null) {
/* 145 */                           Oi0IO1ii011 oi0IO1ii011 = (Oi0IO1ii011) this.I00iio;
                                    try {
/* 147 */                               O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 151 */                               i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 165 */                               objI00000oIO = (O00OoO) o011OoiO1I00000oIO.I00000oOI(O00OoO.Companion.serializer(), str4);
                                    } catch (Throwable th) {
/* 169 */                               objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                                    }
/* 175 */                           if (!(objI00000oIO instanceof Oi10Ii1i1lo)) {
/* 178 */                               O00OoO o00OoO = (O00OoO) objI00000oIO;
/* 180 */                               if (oi0IO1ii011 == null || !(o00OoO instanceof O00illI0o000)) {
/* 217 */                                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ii10ioolOI.I0000O;
/* 219 */                                   olOi110lOOi.I00iOIl = ii10ioolOI;
/* 221 */                                   olOi110lOOi.I00iiI = objI00000oIO;
/* 223 */                                   olOi110lOOi.I00ilI0I1 = 2;
                                        } else {
/* 188 */                                   IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) ii10ioolOI.I0000O;
/* 196 */                                   O00illI0o000 o00illI0o000 = new O00illI0o000(oi0IO1ii011, ((O00illI0o000) o00OoO).I00000oOI);
/* 199 */                                   olOi110lOOi.I00iOIl = ii10ioolOI;
/* 201 */                                   olOi110lOOi.I00iiI = objI00000oIO;
/* 203 */                                   olOi110lOOi.I00ilI0I1 = 1;
                                        }
                                    }
/* 234 */                           Function1 function12 = (Function1) ii10ioolOI.I00000oOI;
/* 236 */                           thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 240 */                           if (thI00000oOI != null) {
/* 242 */                               function12.invoke(thI00000oOI);
                                    }
                                }
                            }
                        } else if (str3.equals("error")) {
/* 127 */                   ((Function1) ii10ioolOI.I00000oOI).invoke(new OlOiOoO(str2));
                        }
/* 245 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 40 */            if (i2 != 1 && i2 != 2) {
/* 47 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                return null;
                    }
/* 51 */            obj = olOi110lOOi.I00iiI;
/* 53 */            Ii10ioolOI ii10ioolOI2 = olOi110lOOi.I00iOIl;
/* 55 */            lIoii1l01l0i.I00000oOI(obj2);
/* 58 */            ii10ioolOI = ii10ioolOI2;
/* 213 */           objI00000oIO = obj;
/* 234 */           Function1 function122 = (Function1) ii10ioolOI.I00000oOI;
/* 236 */           thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 240 */           if (thI00000oOI != null) {
                    }
/* 245 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[PHI: r0 r2
                  0x00ba: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v11 java.lang.Object) binds: [B:32:0x00b7, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r2v13 java.lang.String) = (r2v12 java.lang.String), (r2v15 java.lang.String) binds: [B:32:0x00b7, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oOI(String str, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IIIIOoOIIOI iIIIOoOIIOI;
                    int i;
                    String str2;
                    Object objI00000oOI;
/* 3 */             String str3 = str;
/* 9 */             I10i01 i10i01 = (I10i01) this.I00iiI;
/* 13 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 17 */            if (iOoil1iiIilo instanceof IIIIOoOIIOI) {
/* 20 */                iIIIOoOIIOI = (IIIIOoOIIOI) iOoil1iiIilo;
/* 22 */                int i2 = iIIIOoOIIOI.I00iio;
/* 28 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 31 */                    iIIIOoOIIOI.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 37 */                    iIIIOoOIIOI = new IIIIOoOIIOI(this, iOoil1iiIilo);
                        }
                    }
/* 33 */            IIIIOoOIIOI iIIIOoOIIOI2 = iIIIOoOIIOI;
/* 41 */            Object obj = iIIIOoOIIOI2.I00iiI;
/* 43 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 45 */            int i3 = iIIIOoOIIOI2.I00iio;
/* 48 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 55 */            if (i3 == 0) {
/* 97 */                lIoii1l01l0i.I00000oOI(obj);
/* 110 */               if (!O0000Ioio00.I0000O(str3, (String) oI10i0Il.getValue())) {
/* 117 */                   ((OI10i0Il) this.I00iio).setValue(str3);
/* 122 */                   Float f = new Float(0.0f);
/* 125 */                   iIIIOoOIIOI2.I00iOIl = str3;
/* 127 */                   iIIIOoOIIOI2.I00iio = 1;
/* 133 */                   if (i10i01.I0001Ioi1lo(iIIIOoOIIOI2, f) != ii0111o) {
                            }
                        }
                    }
/* 57 */            if (i3 != 1) {
/* 59 */                if (i3 != 2) {
/* 61 */                    if (i3 != 3) {
/* 63 */                        if (i3 == 4) {
/* 65 */                            lIoii1l01l0i.I00000oOI(obj);
/* 68 */                            return ooiIlOl1iI;
                                }
/* 71 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 53 */                        return null;
                            }
/* 75 */                    lIoii1l01l0i.I00000oOI(obj);
/* 78 */                    objI00000oOI = obj;
/* 79 */                    str2 = null;
/* 189 */                   ((Number) objI00000oOI).longValue();
/* 194 */                   Float f2 = new Float(0.0f);
/* 197 */                   iIIIOoOIIOI2.I00iOIl = str2;
/* 199 */                   iIIIOoOIIOI2.I00iio = 4;
                            return i10i01.I0001Ioi1lo(iIIIOoOIIOI2, f2) != ii0111o ? ii0111o : ooiIlOl1iI;
                        }
/* 82 */                String str4 = iIIIOoOIIOI2.I00iOIl;
/* 84 */                lIoii1l01l0i.I00000oOI(obj);
/* 87 */                str3 = str4;
/* 88 */                i = 3;
/* 89 */                str2 = null;
/* 173 */               oI10i0Il.setValue(str3);
/* 176 */               iIIIOoOIIOI2.I00iOIl = str2;
/* 178 */               iIIIOoOIIOI2.I00iio = i;
/* 180 */               objI00000oOI = Io11lOo1OOi.I00000oOI(iIIIOoOIIOI2);
/* 184 */               if (objI00000oOI != ii0111o) {
/* 189 */                   ((Number) objI00000oOI).longValue();
/* 194 */                   Float f22 = new Float(0.0f);
/* 197 */                   iIIIOoOIIOI2.I00iOIl = str2;
/* 199 */                   iIIIOoOIIOI2.I00iio = 4;
                            if (i10i01.I0001Ioi1lo(iIIIOoOIIOI2, f22) != ii0111o) {
                            }
                        }
                    }
/* 91 */            str3 = iIIIOoOIIOI2.I00iOIl;
/* 93 */            lIoii1l01l0i.I00000oOI(obj);
/* 139 */           I10i01 i10i012 = (I10i01) this.I00iiI;
/* 141 */           i = 3;
/* 146 */           Float f3 = new Float(1.0f);
/* 153 */           OoIoO0I0oOI ooIoO0I0oOII0000O = iOO01lio0.I0000O(120, 2, IioO00o.I00000oOI);
/* 157 */           iIIIOoOIIOI2.I00iOIl = str3;
/* 159 */           iIIIOoOIIOI2.I00iio = 2;
/* 161 */           str2 = null;
/* 170 */           if (I10i01.I00000oIO(i10i012, f3, ooIoO0I0oOII0000O, null, null, iIIIOoOIIOI2, 12) != ii0111o) {
/* 173 */               oI10i0Il.setValue(str3);
/* 176 */               iIIIOoOIIOI2.I00iOIl = str2;
/* 178 */               iIIIOoOIIOI2.I00iio = i;
/* 180 */               objI00000oOI = Io11lOo1OOi.I00000oOI(iIIIOoOIIOI2);
/* 184 */               if (objI00000oOI != ii0111o) {
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
                
                    if (r3.emit(r1, r12) == r5) goto L61;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
                
                    if (r3.emit(r0, r12) == r5) goto L61;
                 */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01ec  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    I0l0lIIo0 i0l0lIIo0;
                    IlOli0o ilOli0o;
                    Object obj2;
/* 3 */             Object obj3 = obj;
/* 7 */             int i = this.I00iOIl;
/* 17 */            IOoil1iiIilo iOoil1iiIilo2 = null;
/* 18 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 474 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiI;
/* 478 */                   if (iOoil1iiIilo instanceof I0l0lIIo0) {
/* 481 */                       i0l0lIIo0 = (I0l0lIIo0) iOoil1iiIilo;
/* 483 */                       int i2 = i0l0lIIo0.I00iio;
/* 487 */                       if ((i2 & Integer.MIN_VALUE) != 0) {
/* 490 */                           i0l0lIIo0.I00iio = i2 - Integer.MIN_VALUE;
                                } else {
/* 495 */                           i0l0lIIo0 = new I0l0lIIo0(this, iOoil1iiIilo);
                                }
                            }
/* 498 */                   Object obj4 = i0l0lIIo0.I00iiI;
/* 500 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 502 */                   int i3 = i0l0lIIo0.I00iio;
/* 504 */                   if (i3 == 0) {
/* 518 */                       lIoii1l01l0i.I00000oOI(obj4);
/* 523 */                       O010OIi o010OIi = (O010OIi) oOo0ooi.I00iOIl;
/* 525 */                       if (o010OIi != null) {
/* 532 */                           o010OIi.I000II(new I0l0IolO());
/* 535 */                           i0l0lIIo0.I00iOIl = obj3;
/* 537 */                           i0l0lIIo0.I00iio = 1;
/* 543 */                           if (o010OIi.I001l0I00(i0l0lIIo0) == ii0111o) {
/* 545 */                               return ii0111o;
                                    }
                                }
                            } else {
/* 506 */                       if (i3 != 1) {
/* 514 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 508 */                       obj3 = i0l0lIIo0.I00iOIl;
/* 510 */                       lIoii1l01l0i.I00000oOI(obj4);
                            }
/* 551 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 575 */                   oOo0ooi.I00iOIl = iOi1II01i0.I0000O(ii0110, null, Ii01I10.I00iio, new I00oIiI10((IlliIl1l11O) this.I00iio, obj3, ii0110, null, 4), 1);
/* 577 */                   return ooiIlOl1iI;
                        case 1:
/* 418 */                   boolean zBooleanValue = ((Boolean) obj3).booleanValue();
/* 424 */                   OoI1iOl0IoI ooI1iOl0IoI = (OoI1iOl0IoI) this.I00iiO;
/* 468 */                   ((OOIoIlO) this.I00iiI).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((IlliIl1l11O) ((OI10i0Il) this.I00iio).getValue()).invoke(ooI1iOl0IoI.I00000oIO.I00olI(), ooI1iOl0IoI.I0000O.getValue())).booleanValue() : false));
/* 471 */                   return ooiIlOl1iI;
                        case 2:
/* 411 */                   return I00000oOI((String) obj3, iOoil1iiIilo);
                        case 3:
/* 307 */                   IooiIloo0i iooiIloo0i = (IooiIloo0i) obj3;
/* 311 */                   ArrayList arrayList = (ArrayList) this.I00iiI;
/* 315 */                   if (iooiIloo0i instanceof IoI1l00l) {
/* 317 */                       arrayList.add(iooiIloo0i);
                            } else if (iooiIloo0i instanceof IoI1lIo00o0i) {
/* 329 */                       arrayList.remove(((IoI1lIo00o0i) iooiIloo0i).I00000oIO);
                            } else if (iooiIloo0i instanceof Ili10OO0ii) {
/* 337 */                       arrayList.add(iooiIloo0i);
                            } else if (iooiIloo0i instanceof Ili10ii1li1) {
/* 349 */                       arrayList.remove(((Ili10ii1li1) iooiIloo0i).I00000oIO);
                            } else if (iooiIloo0i instanceof OOIII1oOoolO) {
/* 357 */                       arrayList.add(iooiIloo0i);
                            } else if (iooiIloo0i instanceof OOIIIiOOili) {
/* 369 */                       arrayList.remove(((OOIIIiOOili) iooiIloo0i).I00000oIO);
                            } else if (iooiIloo0i instanceof OOIII1l) {
/* 381 */                       arrayList.remove(((OOIII1l) iooiIloo0i).I00000oIO);
                            }
/* 405 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new Ii1O001loIoO((IlOi1ilII) this.I00iio, (IooiIloo0i) IOOi0Ool1i.I00IoIO0lI(arrayList), iOoil1iiIilo2, 13), 3);
/* 408 */                   return ooiIlOl1iI;
                        case 4:
/* 194 */                   IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 198 */                   OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 202 */                   if (iOoil1iiIilo instanceof IlOli0o) {
/* 205 */                       ilOli0o = (IlOli0o) iOoil1iiIilo;
/* 207 */                       int i4 = ilOli0o.I00iio;
/* 211 */                       if ((i4 & Integer.MIN_VALUE) != 0) {
/* 214 */                           ilOli0o.I00iio = i4 - Integer.MIN_VALUE;
                                } else {
/* 219 */                           ilOli0o = new IlOli0o(this, iOoil1iiIilo);
                                }
                            }
/* 222 */                   Object objInvoke = ilOli0o.I00iiI;
/* 224 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 226 */                   int i5 = ilOli0o.I00iio;
/* 228 */                   if (i5 == 0) {
/* 251 */                       lIoii1l01l0i.I00000oOI(objInvoke);
/* 256 */                       if (oOo0l0ii10l.I00iOIl) {
/* 258 */                           ilOli0o.I00iOIl = null;
/* 260 */                           ilOli0o.I00iio = 1;
                                    break;
                                } else {
/* 271 */                           IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 273 */                           ilOli0o.I00iOIl = obj3;
/* 275 */                           ilOli0o.I00iio = 2;
/* 277 */                           objInvoke = illiIl1l11O.invoke(obj3, ilOli0o);
/* 281 */                           if (objInvoke != ii0111o2) {
/* 284 */                               obj2 = obj3;
/* 291 */                               if (!((Boolean) objInvoke).booleanValue()) {
                                        }
/* 239 */                               return ooiIlOl1iI;
                                    }
                                }
/* 305 */                       return ii0111o2;
                            }
/* 230 */                   if (i5 != 1) {
/* 232 */                       if (i5 == 2) {
/* 245 */                           obj2 = ilOli0o.I00iOIl;
/* 247 */                           lIoii1l01l0i.I00000oOI(objInvoke);
/* 291 */                           if (!((Boolean) objInvoke).booleanValue()) {
/* 293 */                               oOo0l0ii10l.I00iOIl = true;
/* 295 */                               ilOli0o.I00iOIl = null;
/* 297 */                               ilOli0o.I00iio = 3;
                                        break;
                                    }
/* 239 */                           return ooiIlOl1iI;
                                }
/* 234 */                       if (i5 != 3) {
/* 241 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
                            }
/* 236 */                   lIoii1l01l0i.I00000oOI(objInvoke);
/* 239 */                   return ooiIlOl1iI;
                        case 5:
/* 52 */                    ((Boolean) obj3).getClass();
/* 69 */                    I10lool01 i10lool01 = new I10lool01((OiO1O1lil10) ((OoI1Oi0l1I0o) this.I00iiI).I0000O.getValue());
/* 74 */                    Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiO;
/* 92 */                    for (I10lool01 i10lool012 : IOOi0Ool1i.I00iIi0i1o(ol1o1llOII.I00iiO)) {
/* 104 */                       if (!O0000Ioio00.I0000O(i10lool012, i10lool01)) {
/* 106 */                           ol1o1llOII.remove(i10lool012);
                                }
                            }
/* 112 */                   OI0o0olO1 oI0o0olO1 = (OI0o0olO1) this.I00iio;
/* 114 */                   long[] jArr = oI0o0olO1.I00000oIO;
/* 117 */                   int length = jArr.length - 2;
/* 118 */                   if (length >= 0) {
/* 120 */                       int i6 = 0;
                                while (true) {
/* 121 */                           long j = jArr[i6];
/* 135 */                           if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 144 */                               int i7 = 8 - ((~(i6 - length)) >>> 31);
/* 147 */                               for (int i8 = 0; i8 < i7; i8++) {
/* 156 */                                   if ((255 & j) < 128) {
/* 160 */                                       int i9 = (i6 << 3) + i8;
/* 163 */                                       Object obj5 = oI0o0olO1.I00000oOI[i9];
/* 167 */                                       float f = oI0o0olO1.I0000Il00O[i9];
/* 175 */                                       if (!O0000Ioio00.I0000O((I10lool01) obj5, i10lool01)) {
/* 177 */                                           oI0o0olO1.I0000oI00(i9);
                                                }
                                            }
/* 180 */                                   j >>= 8;
                                        }
/* 184 */                               if (i7 == 8) {
/* 186 */                                   if (i6 != length) {
/* 188 */                                       i6++;
                                            }
                                        }
                                    }
                                }
                            }
/* 191 */                   return ooiIlOl1iI;
                        case 6:
/* 45 */                    return I00000oIO((OillO0lO1O) obj3, iOoil1iiIilo);
                        default:
/* 33 */                    Object objI00000oIO = iOl1OoiOoil.I00000oIO((Ii00l101O) this.I00iiI, obj3, this.I00iiO, (Ol110ii1I) this.I00iio, iOoil1iiIilo);
                            return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                    }
                }
            }
