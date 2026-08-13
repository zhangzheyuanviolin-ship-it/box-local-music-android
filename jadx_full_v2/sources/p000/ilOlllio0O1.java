            package p000;

            import java.io.IOException;
            
            public final class ilOlllio0O1 extends i1ii0i {
                private static final ilOlllio0O1 zzb;
                private int zzd;
                private long zze;
                private i1iliooI1o0 zzf = i1o11i0.I00ilI0I1;
                private i1Ooo10lIl zzg;
                private float zzh;

                static {
/* 3 */             ilOlllio0O1 ilolllio0o1 = new ilOlllio0O1();
/* 6 */             zzb = ilolllio0o1;
/* 10 */            i1ii0i.I0001Ioi1lo(ilOlllio0O1.class, ilolllio0o1);
                }

                public static ilOlllio0O1 I000iOII() {
/* 1 */             return zzb;
                }

                public static ilOlllio0O1 I000l1(byte[] bArr, i1i0OOO10O i1i0ooo10o) throws i1ioOOoI1i1i {
/* 1 */             ilOlllio0O1 ilolllio0o1 = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             if (length != 0) {
/* 7 */                 i1ii0i i1ii0iVarI0000Il00O = ilolllio0o1.I0000Il00O();
                        try {
/* 17 */                    i1o1Ooi i1o1ooiI00000oIO = i1o0Ol1I1oI1.I0000Il00O.I00000oIO(i1ii0iVarI0000Il00O.getClass());
/* 23 */                    i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0();
/* 26 */                    i1i0ooo10o.getClass();
/* 31 */                    i1o1ooiI00000oIO.I0000O(i1ii0iVarI0000Il00O, bArr, 0, length, i1o1ll0i0);
/* 34 */                    i1o1ooiI00000oIO.zze(i1ii0iVarI0000Il00O);
/* 37 */                    ilolllio0o1 = i1ii0iVarI0000Il00O;
                        } catch (i1ioOOoI1i1i e) {
/* 332 */                   throw e;
                        } catch (i1oOl1I0 e2) {
/* 145 */                   throw new i1ioOOoI1i1i(e2.getMessage());
                        } catch (IOException e3) {
/* 115 */                   if (e3.getCause() instanceof i1ioOOoI1i1i) {
/* 123 */                       throw ((i1ioOOoI1i1i) e3.getCause());
                            }
/* 133 */                   throw new i1ioOOoI1i1i(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 106 */                   throw new i1ioOOoI1i1i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
/* 38 */            if (ilolllio0o1 != null) {
/* 40 */                boolean zZzi = true;
/* 47 */                byte bByteValue = ((Byte) ilolllio0o1.I00000oIO(1)).byteValue();
/* 51 */                if (bByteValue != 1) {
/* 54 */                    if (bByteValue == 0) {
/* 56 */                        zZzi = false;
                            } else {
/* 68 */                        zZzi = i1o0Ol1I1oI1.I0000Il00O.I00000oIO(ilolllio0o1.getClass()).zzi(ilolllio0o1);
/* 73 */                        ilolllio0o1.I00000oIO(2);
                            }
                        }
/* 76 */                if (!zZzi) {
/* 95 */                    throw new i1ioOOoI1i1i(new i1oOl1I0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
                        }
                    }
/* 96 */            return ilolllio0o1;
                }

                @Override
                public final Object I00000oIO(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return new i1o1O0ioO(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", ilOiiOl11Oi0.class, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ilOlllio0O1();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1Oo1l0OI(zzb);
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

                public final i1Ooo10lIl I000lI() {
/* 1 */             i1Ooo10lIl i1ooo10lil = this.zzg;
                    return i1ooo10lil == null ? i1Ooo10lIl.I000OiO() : i1ooo10lil;
                }

                public final i1iliooI1o0 I000o00OoI0I() {
/* 1 */             return this.zzf;
                }
            }
