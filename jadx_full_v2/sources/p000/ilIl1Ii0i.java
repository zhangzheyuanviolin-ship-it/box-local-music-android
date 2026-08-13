            package p000;

            import java.io.IOException;
            
            public final class ilIl1Ii0i extends i1loi1lII {
                private static final ilIl1Ii0i zzb;
                private int zzd;
                private long zze;
                private i1o1IiOO zzf = iI011l0.I00ilI0I1;
                private i1l11lO0l00O zzg;
                private float zzh;

                static {
/* 3 */             ilIl1Ii0i ilil1ii0i = new ilIl1Ii0i();
/* 6 */             zzb = ilil1ii0i;
/* 10 */            i1loi1lII.I0001Ioi1lo(ilIl1Ii0i.class, ilil1ii0i);
                }

                public static ilIl1Ii0i I000iOII() {
/* 1 */             return zzb;
                }

                public static ilIl1Ii0i I000l1(byte[] bArr, i1l1o1O0 i1l1o1o0) throws i1o1OOOOiIOi {
/* 1 */             ilIl1Ii0i ilil1ii0i = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             if (length != 0) {
/* 7 */                 i1loi1lII i1loi1liiI0000Il00O = ilil1ii0i.I0000Il00O();
                        try {
/* 17 */                    iI01lO10Oii0 ii01lo10oii0I00000oIO = iI00o0I11.I0000Il00O.I00000oIO(i1loi1liiI0000Il00O.getClass());
/* 23 */                    i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0();
/* 26 */                    i1l1o1o0.getClass();
/* 31 */                    ii01lo10oii0I00000oIO.I00000oOI(i1loi1liiI0000Il00O, bArr, 0, length, i1o1ll0i0);
/* 34 */                    ii01lo10oii0I00000oIO.zze(i1loi1liiI0000Il00O);
/* 37 */                    ilil1ii0i = i1loi1liiI0000Il00O;
                        } catch (i1o1OOOOiIOi e) {
/* 332 */                   throw e;
                        } catch (iI0OiI1l0 e2) {
/* 145 */                   throw new i1o1OOOOiIOi(e2.getMessage());
                        } catch (IOException e3) {
/* 115 */                   if (e3.getCause() instanceof i1o1OOOOiIOi) {
/* 123 */                       throw ((i1o1OOOOiIOi) e3.getCause());
                            }
/* 133 */                   throw new i1o1OOOOiIOi(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 106 */                   throw new i1o1OOOOiIOi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
/* 38 */            if (ilil1ii0i != null) {
/* 40 */                boolean zZzi = true;
/* 47 */                byte bByteValue = ((Byte) ilil1ii0i.I00000oIO(1)).byteValue();
/* 51 */                if (bByteValue != 1) {
/* 54 */                    if (bByteValue == 0) {
/* 56 */                        zZzi = false;
                            } else {
/* 68 */                        zZzi = iI00o0I11.I0000Il00O.I00000oIO(ilil1ii0i.getClass()).zzi(ilil1ii0i);
/* 73 */                        ilil1ii0i.I00000oIO(2);
                            }
                        }
/* 76 */                if (!zZzi) {
/* 95 */                    throw new i1o1OOOOiIOi(new iI0OiI1l0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
                        }
                    }
/* 96 */            return ilil1ii0i;
                }

                @Override
                public final Object I00000oIO(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return new iI01O0i0oll(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", ilIIlI.class, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ilIl1Ii0i();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1l10OO011O(zzb);
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

                public final i1l11lO0l00O I000lI() {
/* 1 */             i1l11lO0l00O i1l11lo0l00o = this.zzg;
                    return i1l11lo0l00o == null ? i1l11lO0l00O.I000OiO() : i1l11lo0l00o;
                }

                public final i1o1IiOO I000o00OoI0I() {
/* 1 */             return this.zzf;
                }
            }
