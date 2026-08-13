            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OoI0Iio extends OIIoI1l0 {
                public IIIII1OI1 I0001Ioi1lo;
                public OlIl0i I000II;

                /* JADX WARN: Multi-variable type inference failed */
                public static OoI0I0o10ll I0000oI00(IIIII1OI1 iiiii1oi1) {
/* 4 */             OI0IIilio1IO oI0IIilio1IO = new OI0IIilio1IO(1);
/* 7 */             oI0IIilio1IO.I00iiI = iiiii1oi1;
/* 9 */             VarHandle.storeStoreFence();
/* 15 */            OoI0I0o10ll ooI0I0o10ll = null;
/* 27 */            OilO111 oilO111I00000oIO = OilOIIlI.I00000oIO((IlliIl1l11O) OilOIIlI.I00000oOI(new Il1ii1000(oI0IIilio1IO, 0 == true ? 1 : 0, 3)).I00000oOI);
/* 35 */            while (oilO111I00000oIO.hasNext()) {
/* 41 */                OoI0I0o10ll ooI0I0o10llI00000oIO = (OoI0I0o10ll) oilO111I00000oIO.next();
/* 43 */                if (ooI0I0o10ll != null) {
/* 47 */                    ooI0I0o10llI00000oIO = ooI0I0o10ll.I00000oIO(ooI0I0o10llI00000oIO);
                        }
/* 45 */                ooI0I0o10ll = ooI0I0o10llI00000oIO;
                    }
/* 77 */            return ooI0I0o10ll;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
                
                    if (r16.I00000oOI.invoke(r0, r6) == r7) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(Oii00o1ll oii00o1ll, OoI0I0o10ll ooI0I0o10ll, IOoilo iOoilo) throws Throwable {
                    OoI0I1ool00 ooI0I1ool00;
/* 9 */             if (iOoilo instanceof OoI0I1ool00) {
/* 12 */                ooI0I1ool00 = (OoI0I1ool00) iOoilo;
/* 14 */                int i = ooI0I1ool00.I00iiO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    ooI0I1ool00.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 29 */                    ooI0I1ool00 = new OoI0I1ool00(this, iOoilo);
                        }
                    }
/* 25 */            OoI0I1ool00 ooI0I1ool002 = ooI0I1ool00;
/* 33 */            Object obj = ooI0I1ool002.I00iOIl;
/* 35 */            Object obj2 = Ii0111o.I00iOIl;
/* 37 */            int i2 = ooI0I1ool002.I00iiO;
/* 39 */            IoloOio0I ioloOio0I = this.I0000oI00;
/* 43 */            if (i2 == 0) {
/* 66 */                lIoii1l01l0i.I00000oOI(obj);
/* 71 */                OOo0ooi oOo0ooi = new OOo0ooi();
/* 74 */                oOo0ooi.I00iOIl = ooI0I0o10ll;
/* 76 */                long j = ooI0I0o10ll.I00000oOI;
/* 78 */                long j2 = ooI0I0o10ll.I00000oIO;
/* 93 */                ((OooIlilo) ioloOio0I.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j2 >> 32)), j);
/* 111 */               ((OooIlilo) ioloOio0I.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
/* 116 */               OoI0I0o10ll ooI0I0o10llI0000oI00 = I0000oI00(this.I0001Ioi1lo);
/* 120 */               if (ooI0I0o10llI0000oI00 != null) {
/* 122 */                   long j3 = ooI0I0o10llI0000oI00.I00000oOI;
/* 124 */                   long j4 = ooI0I0o10llI0000oI00.I00000oIO;
/* 139 */                   ((OooIlilo) ioloOio0I.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j4 >> 32)), j3);
/* 153 */                   ((OooIlilo) ioloOio0I.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
/* 164 */                   oOo0ooi.I00iOIl = ((OoI0I0o10ll) oOo0ooi.I00iOIl).I00000oIO(ooI0I0o10llI0000oI00);
                        }
/* 173 */               IlliIl1l11O i000oI1ioi = new I000oI1ioi(this, oii00o1ll, oOo0ooi, null, 23);
/* 176 */               ooI0I1ool002.I00iiO = 1;
/* 182 */               if (I00000oOI(i000oI1ioi, ooI0I1ool002) != obj2) {
                        }
/* 222 */               return obj2;
                    }
/* 45 */            if (i2 != 1) {
/* 47 */                if (i2 == 2) {
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 223 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 56 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 59 */                return null;
                    }
/* 61 */            lIoii1l01l0i.I00000oOI(obj);
/* 208 */           OooIOilolOo oooIOilolOoI00000oIO = OooIOilolOo.I00000oIO(li1OoIii00.I00000oIO(((OooIlilo) ioloOio0I.I00iiI).I0000Il00O(Float.MAX_VALUE), ((OooIlilo) ioloOio0I.I00iiO).I0000Il00O(Float.MAX_VALUE)));
/* 212 */           ooI0I1ool002.I00iiO = 2;
                }

                public final boolean I0000O(OO1Oooio101 oO1Oooio101) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    Oii00o1ll oii00o1ll;
/* 5 */             IIIII1OI1 iiiii1oi1 = this.I0001Ioi1lo;
/* 13 */            OO1il00lI oO1il00lI = (OO1il00lI) IOOi0Ool1i.I00II0Ol1O0l(oO1Oooio101.I00000oIO);
/* 15 */            if (oO1il00lI != null) {
/* 17 */                List listI00000oOI = oO1il00lI.I00000oOI();
/* 24 */                int size = listI00000oOI.size();
/* 28 */                int i = 0;
/* 29 */                z3 = false;
                        while (true) {
/* 31 */                    oii00o1ll = this.I00000oIO;
/* 38 */                    if (i >= size) {
                                break;
                            }
/* 44 */                    Io1ioI0ioIO io1ioI0ioIO = (Io1ioI0ioIO) listI00000oOI.get(i);
/* 51 */                    long j = io1ioI0ioIO.I0000O ^ (-9223372034707292160L);
/* 68 */                    if (!(oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(j)) == 0.0f)) {
/* 99 */                        z3 = !(iiiii1oi1.I000lI(new OoI0I0o10ll(j, io1ioI0ioIO.I00000oIO, false)) instanceof IO10l0l0) || z3;
                            }
/* 100 */                   i++;
                        }
/* 103 */               z = true;
/* 104 */               z2 = false;
/* 108 */               long j2 = oO1il00lI.I000l1 ^ (-9223372034707292160L);
/* 118 */               boolean z4 = oO1Oooio101.I0001Ioi1lo == 12;
/* 136 */               if (!(oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(j2)) == 0.0f) || z4) {
/* 159 */                   if (!(iiiii1oi1.I000lI(new OoI0I0o10ll(j2, oO1il00lI.I00000oOI, z4)) instanceof IO10l0l0) || z3) {
/* 163 */                       z3 = true;
                            }
                        }
                        return (!z3 || this.I0000O) ? z : z2;
                    }
/* 165 */           z = true;
/* 166 */           z2 = false;
/* 168 */           z3 = z2;
                    if (z3) {
                    }
                }
            }
