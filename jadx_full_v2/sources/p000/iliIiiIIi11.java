            package p000;

            import java.io.IOException;
            
            public final class iliIiiIIi11 extends i1ilOol {
                private static final iliIiiIIi11 zzb;
                private int zzd;
                private long zze;
                private i1l01Iiii1 zzf = i1o1lO10I.I00ilI0I1;
                private i1i0Oi1 zzg;
                private float zzh;

                static {
/* 3 */             iliIiiIIi11 iliiiiiii11 = new iliIiiIIi11();
/* 6 */             zzb = iliiiiiii11;
/* 10 */            i1ilOol.I0001Ioi1lo(iliIiiIIi11.class, iliiiiiii11);
                }

                public static iliIiiIIi11 I000iOII() {
/* 1 */             return zzb;
                }

                public static iliIiiIIi11 I000l1(byte[] bArr, i1i1ilo01 i1i1ilo01Var) {
/* 1 */             iliIiiIIi11 iliiiiiii11 = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             if (length != 0) {
/* 7 */                 i1ilOol i1iloolI0000Il00O = iliiiiiii11.I0000Il00O();
                        try {
/* 17 */                    i1oIIli1lo1O i1oiili1lo1oI00000oIO = i1o1i00IlOiO.I0000Il00O.I00000oIO(i1iloolI0000Il00O.getClass());
/* 23 */                    i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0();
/* 26 */                    i1i1ilo01Var.getClass();
/* 31 */                    i1oiili1lo1oI00000oIO.I0000O(i1iloolI0000Il00O, bArr, 0, length, i1o1ll0i0);
/* 34 */                    i1oiili1lo1oI00000oIO.zze(i1iloolI0000Il00O);
/* 37 */                    iliiiiiii11 = i1iloolI0000Il00O;
                        } catch (i1l0io1oi e) {
/* 332 */                   throw e;
                        } catch (i1oiOIoO e2) {
/* 145 */                   throw new i1l0io1oi(e2.getMessage());
                        } catch (IOException e3) {
/* 115 */                   if (e3.getCause() instanceof i1l0io1oi) {
/* 123 */                       throw ((i1l0io1oi) e3.getCause());
                            }
/* 133 */                   throw new i1l0io1oi(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 106 */                   throw new i1l0io1oi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
/* 38 */            if (iliiiiiii11 != null) {
/* 40 */                boolean zZzi = true;
/* 47 */                byte bByteValue = ((Byte) iliiiiiii11.I00000oIO(1)).byteValue();
/* 51 */                if (bByteValue != 1) {
/* 54 */                    if (bByteValue == 0) {
/* 56 */                        zZzi = false;
                            } else {
/* 68 */                        zZzi = i1o1i00IlOiO.I0000Il00O.I00000oIO(iliiiiiii11.getClass()).zzi(iliiiiiii11);
/* 73 */                        iliiiiiii11.I00000oIO(2);
                            }
                        }
/* 76 */                if (!zZzi) {
/* 95 */                    throw new i1l0io1oi(new i1oiOIoO("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
                        }
                    }
/* 96 */            return iliiiiiii11;
                }

                @Override
                public final Object I00000oIO(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return new i1oI1I00i0(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", ilOol0ol01I0.class, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iliIiiIIi11();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1i001iIO0I(zzb);
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

                public final i1i0Oi1 I000lI() {
/* 1 */             i1i0Oi1 i1i0oi1 = this.zzg;
                    return i1i0oi1 == null ? i1i0Oi1.I000OiO() : i1i0oi1;
                }

                public final i1l01Iiii1 I000o00OoI0I() {
/* 1 */             return this.zzf;
                }
            }
