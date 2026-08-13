            package p000;
            
            public final class I1oo1IiiOIo extends Oi10IOIi implements IlliIl1l11O {
                public OlO0OIIl1 I00iiI;
                public OO1i0l I00iiO;
                public long I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;
                public final Ii0110 I00io1l;
                public final Oo1o1iil I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oo1IiiOIo(Ii0110 ii0110, Oo1o1iil oo1o1iil, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = ii0110;
/* 3 */             this.I00ioIO = oo1o1iil;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             I1oo1IiiOIo i1oo1IiiOIo = new I1oo1IiiOIo(this.I00io1l, this.I00ioIO, iOoil1iiIilo);
/* 10 */            i1oo1IiiOIo.I00ilO0 = obj;
/* 37 */            return i1oo1IiiOIo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I1oo1IiiOIo) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c1, B:43:0x00c5), top: B:50:0x0014 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OlO0OIIl1 olO0OIIl1I00000oIO;
                    OO1i0l oO1i0l;
                    long j;
                    Oll11lOlo oll11lOlo;
                    OlO0OIIl1 olO0OIIl1;
                    OlO0OIIl1 olO0OIIl12;
                    OO1il00lI oO1il00lI;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00ilI0I1;
/* 7 */             int i2 = 1;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 9 */             if (i == 0) {
/* 76 */                lIoii1l01l0i.I00000oOI(obj);
/* 81 */                Oll11lOlo oll11lOlo2 = (Oll11lOlo) this.I00ilO0;
/* 85 */                olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 93 */                long jI00000oOI = oll11lOlo2.I0001Ioi1lo().I00000oOI();
/* 97 */                oO1i0l = OO1i0l.I00iOIl;
/* 99 */                this.I00ilO0 = oll11lOlo2;
/* 101 */               this.I00iiI = olO0OIIl1I00000oIO;
/* 103 */               this.I00iiO = oO1i0l;
/* 105 */               this.I00iio = jI00000oOI;
/* 107 */               this.I00ilI0I1 = 1;
/* 109 */               Object objI00000oOI = OloI0l1i1oO.I00000oOI(oll11lOlo2, this, 1);
/* 113 */               if (objI00000oOI != ii0111o) {
/* 116 */                   j = jI00000oOI;
/* 117 */                   oll11lOlo = oll11lOlo2;
/* 118 */                   obj = objI00000oOI;
                        }
/* 192 */               return ii0111o;
                    }
/* 11 */            if (i != 1) {
/* 13 */                if (i != 2) {
/* 15 */                    if (i != 3) {
/* 31 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 19 */                    olO0OIIl12 = (OlO0OIIl1) this.I00ilO0;
                            try {
/* 21 */                        lIoii1l01l0i.I00000oOI(obj);
/* 194 */                       oO1il00lI = (OO1il00lI) obj;
/* 196 */                       if (oO1il00lI != null) {
/* 198 */                           oO1il00lI.I00000oIO();
                                }
/* 201 */                       Boolean bool = Boolean.FALSE;
/* 203 */                       olO0OIIl12.getClass();
/* 206 */                       olO0OIIl12.I000lI(null, bool);
/* 219 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 26 */                        th = th;
/* 210 */                       Boolean bool2 = Boolean.FALSE;
/* 212 */                       olO0OIIl12.getClass();
/* 215 */                       olO0OIIl12.I000lI(null, bool2);
/* 218 */                       throw th;
                            }
                        }
/* 35 */                OO1i0l oO1i0l2 = this.I00iiO;
/* 37 */                olO0OIIl1 = this.I00iiI;
/* 41 */                oll11lOlo = (Oll11lOlo) this.I00ilO0;
                        try {
/* 43 */                    lIoii1l01l0i.I00000oOI(obj);
/* 150 */                   Boolean bool3 = Boolean.FALSE;
/* 152 */                   olO0OIIl1.getClass();
/* 155 */                   olO0OIIl1.I000lI(null, bool3);
                        } catch (OO1i1lOl unused) {
/* 52 */                    oO1i0l = oO1i0l2;
/* 53 */                    olO0OIIl1I00000oIO = olO0OIIl1;
/* 175 */                   iOi1II01i0.I0000O(this.I00io1l, null, Ii01I10.I00iio, new I00oIiI10(olO0OIIl1I00000oIO, this.I00ioIO, iOoil1iiIilo, 12), 1);
/* 178 */                   this.I00ilO0 = olO0OIIl1I00000oIO;
/* 180 */                   this.I00iiI = null;
/* 182 */                   this.I00iiO = null;
/* 184 */                   this.I00ilI0I1 = 3;
/* 186 */                   obj = OloI0l1i1oO.I000OiO(oll11lOlo, oO1i0l, this);
/* 190 */                   if (obj != ii0111o) {
                            }
/* 192 */                   return ii0111o;
                        } catch (Throwable th2) {
/* 48 */                    th = th2;
/* 49 */                    olO0OIIl12 = olO0OIIl1;
/* 210 */                   Boolean bool22 = Boolean.FALSE;
/* 212 */                   olO0OIIl12.getClass();
/* 215 */                   olO0OIIl12.I000lI(null, bool22);
/* 218 */                   throw th;
                        }
/* 219 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 56 */            long j2 = this.I00iio;
/* 58 */            OO1i0l oO1i0l3 = this.I00iiO;
/* 60 */            OlO0OIIl1 olO0OIIl13 = this.I00iiI;
/* 64 */            Oll11lOlo oll11lOlo3 = (Oll11lOlo) this.I00ilO0;
/* 66 */            lIoii1l01l0i.I00000oOI(obj);
/* 70 */            oO1i0l = oO1i0l3;
/* 71 */            olO0OIIl1I00000oIO = olO0OIIl13;
/* 72 */            j = j2;
/* 73 */            oll11lOlo = oll11lOlo3;
/* 74 */            long j3 = j;
/* 122 */           int i3 = ((OO1il00lI) obj).I000OOo1O;
/* 124 */           if (i3 == 1 || i3 == 3) {
                        try {
                            try {
/* 131 */                       I0o1OOOo i0o1OOOo = new I0o1OOOo(oO1i0l, iOoil1iiIilo, i2);
/* 134 */                       this.I00ilO0 = oll11lOlo;
/* 136 */                       this.I00iiI = olO0OIIl1I00000oIO;
/* 138 */                       this.I00iiO = oO1i0l;
/* 140 */                       this.I00ilI0I1 = 2;
/* 146 */                       if (oll11lOlo.I000II(j3, i0o1OOOo, this) != ii0111o) {
/* 149 */                           olO0OIIl1 = olO0OIIl1I00000oIO;
/* 150 */                           Boolean bool32 = Boolean.FALSE;
/* 152 */                           olO0OIIl1.getClass();
/* 155 */                           olO0OIIl1.I000lI(null, bool32);
                                }
                            } catch (OO1i1lOl unused2) {
/* 175 */                       iOi1II01i0.I0000O(this.I00io1l, null, Ii01I10.I00iio, new I00oIiI10(olO0OIIl1I00000oIO, this.I00ioIO, iOoil1iiIilo, 12), 1);
/* 178 */                       this.I00ilO0 = olO0OIIl1I00000oIO;
/* 180 */                       this.I00iiI = null;
/* 182 */                       this.I00iiO = null;
/* 184 */                       this.I00ilI0I1 = 3;
/* 186 */                       obj = OloI0l1i1oO.I000OiO(oll11lOlo, oO1i0l, this);
/* 190 */                       if (obj != ii0111o) {
/* 193 */                           olO0OIIl12 = olO0OIIl1I00000oIO;
/* 194 */                           oO1il00lI = (OO1il00lI) obj;
/* 196 */                           if (oO1il00lI != null) {
                                    }
/* 201 */                           Boolean bool4 = Boolean.FALSE;
/* 203 */                           olO0OIIl12.getClass();
/* 206 */                           olO0OIIl12.I000lI(null, bool4);
/* 219 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 192 */                       return ii0111o;
                            }
/* 192 */                   return ii0111o;
                        } catch (Throwable th3) {
/* 159 */                   th = th3;
/* 160 */                   olO0OIIl12 = olO0OIIl1I00000oIO;
/* 210 */                   Boolean bool222 = Boolean.FALSE;
/* 212 */                   olO0OIIl12.getClass();
/* 215 */                   olO0OIIl12.I000lI(null, bool222);
/* 218 */                   throw th;
                        }
                    }
/* 219 */           return OoiIlOl1iI.I00000oIO;
                }
            }
