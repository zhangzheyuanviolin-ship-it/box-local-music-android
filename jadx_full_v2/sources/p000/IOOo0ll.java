            package p000;

            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class IOOo0ll extends Oll0io implements IlliIl1l11O {
                public Object[] I00iOIl;
                public IO1010 I00iiI;
                public byte[] I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public Object I00ioIO;
                public final IlOil1ii[] I00l0I0l0lO1;
                public final O0l1iloO I00l0OO0IO;
                public final IiIIl0OOio0O I00li1OI;
                public final IlOil1iooOO0 I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOOo0ll(IlOil1ii[] ilOil1iiArr, O0l1iloO o0l1iloO, IiIIl0OOio0O iiIIl0OOio0O, IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00l0I0l0lO1 = ilOil1iiArr;
/* 3 */             this.I00l0OO0IO = o0l1iloO;
/* 5 */             this.I00li1OI = iiIIl0OOio0O;
/* 7 */             this.I00ll1 = ilOil1iooOO0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            IOOo0ll iOOo0ll = new IOOo0ll(this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, iOoil1iiIilo);
/* 15 */            iOOo0ll.I00ioIO = obj;
/* 89 */            return iOOo0ll;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IOOo0ll) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
                
                    if (r3 != 0) goto L20;
                 */
                /* JADX WARN: Path cross not found for [B:34:0x00bb, B:32:0x00ac], limit reached: 39 */
                /* JADX WARN: Path cross not found for [B:35:0x00bd, B:20:0x0078], limit reached: 39 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[LOOP:0: B:27:0x009c->B:40:?, LOOP_START, PHI: r3 r13
                  0x009c: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:24:0x0097, B:40:?] A[DONT_GENERATE, DONT_INLINE]
                  0x009c: PHI (r13v4 Iol0oIiIOI) = (r13v3 Iol0oIiIOI), (r13v10 Iol0oIiIOI) binds: [B:24:0x0097, B:40:?] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:20:0x0078). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int length;
                    Object[] objArr;
                    byte[] bArr;
                    int i;
                    int i2;
                    IO1010 io1010;
                    Object objI000o00OoI0I;
                    Iol0oIiIOI iol0oIiIOI;
/* 5 */             Ii0110 ii0110 = (Ii0110) this.I00ioIO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i3 = this.I00io1l;
/* 12 */            I0OooiI1I i0OooiI1I = OIOOIO0o.I00000oOI;
/* 17 */            if (i3 == 0) {
/* 71 */                lIoii1l01l0i.I00000oOI(obj);
/* 76 */                length = this.I00l0I0l0lO1.length;
/* 77 */                if (length != 0) {
/* 80 */                    objArr = new Object[length];
/* 82 */                    Arrays.fill(objArr, 0, length, i0OooiI1I);
/* 86 */                    IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(length, null, null, 6);
/* 92 */                    AtomicInteger atomicInteger = new AtomicInteger(length);
/* 96 */                    for (int i4 = 0; i4 < length; i4++) {
/* 109 */                       iOi1II01i0.I0000O(ii0110, null, null, new I00111O(this.I00l0I0l0lO1, i4, atomicInteger, iiiii1oi1I00000oIO, null), 3);
                            }
/* 115 */                   bArr = new byte[length];
/* 117 */                   i = length;
/* 118 */                   i2 = 0;
/* 119 */                   io1010 = iiiii1oi1I00000oIO;
                        }
/* 154 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 19 */            if (i3 == 1) {
/* 49 */                i2 = this.I00ilO0;
/* 51 */                length = this.I00ilI0I1;
/* 53 */                i = this.I00iio;
/* 55 */                bArr = this.I00iiO;
/* 57 */                io1010 = this.I00iiI;
/* 59 */                objArr = this.I00iOIl;
/* 61 */                lIoii1l01l0i.I00000oOI(obj);
/* 68 */                objI000o00OoI0I = ((IO10lIoiO) obj).I00000oIO;
/* 150 */               iol0oIiIOI = (Iol0oIiIOI) IO10lIoiO.I0000Il00O(objI000o00OoI0I);
/* 152 */               if (iol0oIiIOI != null) {
                            while (true) {
/* 157 */                       int i5 = iol0oIiIOI.I00000oIO;
/* 159 */                       Object obj2 = objArr[i5];
/* 163 */                       objArr[i5] = iol0oIiIOI.I00000oOI;
/* 165 */                       if (obj2 == i0OooiI1I) {
                                    length--;
                                }
/* 171 */                       if (bArr[i5] != i2) {
/* 174 */                           bArr[i5] = (byte) i2;
/* 184 */                           iol0oIiIOI = (Iol0oIiIOI) IO10lIoiO.I0000Il00O(io1010.I0000oI00());
/* 186 */                           if (iol0oIiIOI != null) {
                                    }
                                }
/* 188 */                       if (length == 0) {
/* 197 */                           IOo100ol1lIo[] iOo100ol1lIoArr = new IOo100ol1lIo[((IlOil1ii[]) this.I00l0OO0IO.I00iiI).length];
/* 201 */                           I1IoiO1l.I000oI1ioi(objArr, 0, iOo100ol1lIoArr, 0, 14);
/* 204 */                           this.I00ioIO = null;
/* 206 */                           this.I00iOIl = objArr;
/* 208 */                           this.I00iiI = io1010;
/* 210 */                           this.I00iiO = bArr;
/* 212 */                           this.I00iio = i;
/* 214 */                           this.I00ilI0I1 = length;
/* 216 */                           this.I00ilO0 = i2;
/* 218 */                           this.I00io1l = 3;
/* 228 */                           if (this.I00li1OI.invoke(this.I00ll1, iOo100ol1lIoArr, this) != ii0111o) {
                                        break;
                                    }
                                }
                            }
                        }
/* 154 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 22 */            if (i3 != 2 && i3 != 3) {
/* 29 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                return null;
                    }
/* 33 */            i2 = this.I00ilO0;
/* 35 */            length = this.I00ilI0I1;
/* 37 */            i = this.I00iio;
/* 39 */            bArr = this.I00iiO;
/* 41 */            io1010 = this.I00iiI;
/* 43 */            objArr = this.I00iOIl;
/* 45 */            lIoii1l01l0i.I00000oOI(obj);
/* 122 */           i2 = (byte) (i2 + 1);
/* 123 */           this.I00ioIO = null;
/* 125 */           this.I00iOIl = objArr;
/* 127 */           this.I00iiI = io1010;
/* 129 */           this.I00iiO = bArr;
/* 131 */           this.I00iio = i;
/* 133 */           this.I00ilI0I1 = length;
/* 135 */           this.I00ilO0 = i2;
/* 137 */           this.I00io1l = 1;
/* 139 */           objI000o00OoI0I = io1010.I000o00OoI0I(this);
/* 143 */           if (objI000o00OoI0I != ii0111o) {
/* 150 */               iol0oIiIOI = (Iol0oIiIOI) IO10lIoiO.I0000Il00O(objI000o00OoI0I);
/* 152 */               if (iol0oIiIOI != null) {
                        }
/* 154 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 966 */           return ii0111o;
                }
            }
