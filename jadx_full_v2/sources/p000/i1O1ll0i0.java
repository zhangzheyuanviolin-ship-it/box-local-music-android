            package p000;

            import java.lang.invoke.VarHandle;
            
/* 11 */    public final class i1O1ll0i0 {
                public int I00000oIO;
                public long I00000oOI;
                public Object I0000Il00O;
                public int I0000O;

                public i1O1ll0i0(IlOoi1ilio00 ilOoi1ilio00, long j, int i, int i2) {
/* 4 */             this.I0000Il00O = ilOoi1ilio00;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I00000oIO = i;
/* 10 */            this.I0000O = i2;
                }

                public static String I0000Il00O(int i, int i2, byte b, String str, String str2) {
/* 21 */            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
/* 24 */            sb.append(str);
/* 27 */            sb.append(i2);
/* 30 */            sb.append(str2);
/* 33 */            sb.append(i);
/* 36 */            return sb.toString();
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IlOoIlO0I I00000oIO(IlOoIo ilOoIo, boolean z, int i, int i2, int i3, int i4) {
                    IlOoIlO0I ilOoIlO0I;
                    O1iIo0ll o1iIo0ll;
                    IooIiOoIIoO iooIiOoIIoO;
                    OO1I0001000i oO1I0001000i;
/* 4 */             if (ilOoIo.I00iiI) {
/* 9 */                 IlOoi1ilio00 ilOoi1ilio00 = (IlOoi1ilio00) this.I0000Il00O;
/* 13 */                int iOrdinal = ilOoi1ilio00.I00000oIO.ordinal();
/* 17 */                boolean z2 = true;
/* 18 */                if (iOrdinal == 0 || iOrdinal == 1) {
/* 57 */                    ilOoIlO0I = null;
/* 77 */                    if (ilOoIlO0I != null) {
/* 80 */                        if (i < 0 || (i4 != 0 && (i3 - ((int) (ilOoIlO0I.I0000Il00O >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
/* 99 */                            z2 = false;
                                }
/* 100 */                       ilOoIlO0I.I0000O = z2;
/* 685 */                       return ilOoIlO0I;
                            }
                        } else {
/* 23 */                    if (iOrdinal != 2 && iOrdinal != 3) {
/* 29 */                        I000II.I00000oIO();
/* 3 */                         return null;
                            }
/* 33 */                    if (z) {
/* 35 */                        o1iIo0ll = ilOoi1ilio00.I00000oOI;
/* 37 */                        iooIiOoIIoO = ilOoi1ilio00.I0001Ioi1lo;
/* 39 */                        oO1I0001000i = ilOoi1ilio00.I0000Il00O;
                            } else {
/* 50 */                        o1iIo0ll = (i < -1 || i2 < 0) ? null : ilOoi1ilio00.I0000O;
/* 51 */                        iooIiOoIIoO = ilOoi1ilio00.I000II;
/* 53 */                        oO1I0001000i = ilOoi1ilio00.I0000oI00;
                            }
/* 55 */                    if (o1iIo0ll != null) {
/* 61 */                        long j = iooIiOoIIoO.I00000oIO;
/* 63 */                        ilOoIlO0I = new IlOoIlO0I();
/* 66 */                        ilOoIlO0I.I00000oIO = o1iIo0ll;
/* 68 */                        ilOoIlO0I.I00000oOI = oO1I0001000i;
/* 70 */                        ilOoIlO0I.I0000Il00O = j;
/* 72 */                        ilOoIlO0I.I0000O = true;
/* 74 */                        VarHandle.storeStoreFence();
                            }
/* 77 */                    if (ilOoIlO0I != null) {
                            }
                        }
                    }
/* 3 */             return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                
                    if ((((int) (r24 & 4294967295L)) - ((int) (r19 & 4294967295L))) < 0) goto L13;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IlOoIo I00000oOI(boolean z, int i, long j, IooIiOoIIoO iooIiOoIIoO, int i2, int i3, int i4, boolean z2, boolean z3) {
                    long j2;
/* 11 */            int i5 = this.I00000oIO;
/* 13 */            int i6 = this.I0000O;
/* 15 */            long j3 = this.I00000oOI;
/* 19 */            IlOoi1ilio00 ilOoi1ilio00 = (IlOoi1ilio00) this.I0000Il00O;
/* 22 */            int i7 = i3 + i4;
/* 24 */            boolean z4 = true;
/* 25 */            if (iooIiOoIIoO == null) {
/* 29 */                return new IlOoIo(z4, z4);
                    }
/* 33 */            long j4 = iooIiOoIIoO.I00000oIO;
/* 47 */            if (ilOoi1ilio00.I00000oIO != IlOoi0i0.I00iOIl) {
/* 52 */                if (i2 < Integer.MAX_VALUE) {
/* 55 */                    j2 = j4;
                        }
/* 68 */                boolean z5 = true;
/* 69 */                return new IlOoIo(z5, z5);
                    }
/* 49 */            j2 = j4;
/* 75 */            if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
/* 90 */                if (!z2) {
/* 145 */                   return new IlOoIo(true, I00000oOI(z, 0, IooIiOoIIoO.I00000oOI(IOo0oO11ll1O.I000OiO(j3), (((int) (j & 4294967295L)) - i6) - i4), IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(((int) (j2 >> 32)) - i5, (int) (j2 & 4294967295L))), i2 + 1, i7, 0, true, false).I00iiI);
                        }
/* 94 */                boolean z6 = true;
/* 95 */                return new IlOoIo(z6, z6);
                    }
/* 151 */           int i8 = (int) (j2 & 4294967295L);
/* 156 */           int iMax = Math.max(i4, i8) + i3;
/* 164 */           IooIiOoIIoO iooIiOoIIoOI00000oIO = z3 ? null : ilOoi1ilio00.I00000oIO(i2, iMax, z);
/* 168 */           if (iooIiOoIIoOI00000oIO != null) {
/* 170 */               long j5 = iooIiOoIIoOI00000oIO.I00000oIO;
/* 176 */               if (i + 1 >= Integer.MAX_VALUE || ((((int) (j >> 32)) - ((int) (j2 >> 32))) - i5) - ((int) (j5 >> 32)) < 0) {
/* 192 */                   if (z3) {
/* 196 */                       boolean z7 = true;
/* 197 */                       return new IlOoIo(z7, z7);
                            }
/* 236 */                   boolean z8 = I00000oOI(false, 0, IooIiOoIIoO.I00000oOI(IOo0oO11ll1O.I000OiO(j3), (((int) (j & 4294967295L)) - i6) - Math.max(i4, i8)), iooIiOoIIoOI00000oIO, i2 + 1, iMax, 0, true, true).I00iiI;
/* 238 */                   return new IlOoIo(z8, z8);
                        }
                    }
/* 244 */           boolean z9 = false;
/* 245 */           return new IlOoIo(z9, z9);
                }

/* 12 */        public i1O1ll0i0(i1o0l0i i1o0l0iVar) {
                    i1o0l0iVar.getClass();
                }
            }
