            package p000;

            import java.io.IOException;
            
            public final class ilOllIii0OO extends i1ii0Io {
                private static final ilOllIii0OO zzb;
                private int zzd;
                private long zze;
                private i1iliO0I zzf = i1o10iIooI.I00ilI0I1;
                private i1Ooo0liii zzg;
                private float zzh;

                static {
/* 3 */             ilOllIii0OO ilolliii0oo = new ilOllIii0OO();
/* 6 */             zzb = ilolliii0oo;
/* 10 */            i1ii0Io.I0001Ioi1lo(ilOllIii0OO.class, ilolliii0oo);
                }

                public static ilOllIii0OO I000iOII() {
/* 1 */             return zzb;
                }

                public static ilOllIii0OO I000l1(byte[] bArr, i1i0OIoO1iO i1i0oioo1io) throws i1ioIilo10 {
/* 1 */             ilOllIii0OO ilolliii0oo = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             if (length != 0) {
/* 7 */                 i1ii0Io i1ii0ioI0000Il00O = ilolliii0oo.I0000Il00O();
                        try {
/* 17 */                    i1o1Oo i1o1ooI00000oIO = i1o0Oi.I0000Il00O.I00000oIO(i1ii0ioI0000Il00O.getClass());
/* 23 */                    i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0();
/* 26 */                    i1i0oioo1io.getClass();
/* 31 */                    i1o1ooI00000oIO.I0000Il00O(i1ii0ioI0000Il00O, bArr, 0, length, i1o1ll0i0);
/* 34 */                    i1o1ooI00000oIO.zze(i1ii0ioI0000Il00O);
/* 37 */                    ilolliii0oo = i1ii0ioI0000Il00O;
                        } catch (i1ioIilo10 e) {
/* 332 */                   throw e;
                        } catch (i1oOiOOO e2) {
/* 145 */                   throw new i1ioIilo10(e2.getMessage());
                        } catch (IOException e3) {
/* 115 */                   if (e3.getCause() instanceof i1ioIilo10) {
/* 123 */                       throw ((i1ioIilo10) e3.getCause());
                            }
/* 133 */                   throw new i1ioIilo10(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 106 */                   throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
/* 38 */            if (ilolliii0oo != null) {
/* 40 */                boolean zZzi = true;
/* 47 */                byte bByteValue = ((Byte) ilolliii0oo.I00000oIO(1)).byteValue();
/* 51 */                if (bByteValue != 1) {
/* 54 */                    if (bByteValue == 0) {
/* 56 */                        zZzi = false;
                            } else {
/* 68 */                        zZzi = i1o0Oi.I0000Il00O.I00000oIO(ilolliii0oo.getClass()).zzi(ilolliii0oo);
/* 73 */                        ilolliii0oo.I00000oIO(2);
                            }
                        }
/* 76 */                if (!zZzi) {
/* 95 */                    throw new i1ioIilo10(new i1oOiOOO("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
                        }
                    }
/* 96 */            return ilolliii0oo;
                }

                @Override
                public final Object I00000oIO(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return new i1o1Ioll0I(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", ilOiiIOO0oo.class, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ilOllIii0OO();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1Oo1IIoiolo(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 17 */                return zzb;
                    }
/* 21 */            throw null;
                }

                public final float I000OOo1O() {
/* 1 */             return this.zzh;
                }

                public final long I000OiO() {
/* 1 */             return this.zze;
                }

                public final i1Ooo0liii I000lI() {
/* 1 */             i1Ooo0liii i1ooo0liii = this.zzg;
                    return i1ooo0liii == null ? i1Ooo0liii.I000OiO() : i1ooo0liii;
                }

                public final i1iliO0I I000o00OoI0I() {
/* 1 */             return this.zzf;
                }
            }
