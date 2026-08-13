            package p000;

            import android.os.Build;
            import java.io.IOException;
            
            public final class loO1IolO extends ilOl10 {
                private static final loO1IolO zzb;
                private int zzd;
                private int zzh;
                private iliiiioo zze = ioIioOi0IOI.I00iio;
                private String zzf = "";
                private String zzg = "";
                private String zzi = "";
                private String zzj = "";
                private String zzk = "";

                static {
/* 3 */             loO1IolO loo1iolo = new loO1IolO();
/* 6 */             zzb = loo1iolo;
/* 10 */            ilOl10.I000OOo1O(loO1IolO.class, loo1iolo);
                }

                public static lo00l1i1O1O I00100l0() {
/* 10 */            return (lo00l1i1O1O) ((ilOI1I0llIi) zzb.I000lI(5));
                }

                public static loO1IolO I00100o1O0lo() {
/* 1 */             return zzb;
                }

                public static loO1IolO I0010I0i(byte[] bArr, ilI1iIO0oiIo ili1iio0oiio) throws ill0ll01OOOO {
/* 1 */             loO1IolO loo1iolo = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             ilOl10 ilol10I0000oI00 = loo1iolo.I0000oI00();
                    try {
/* 14 */                ioO0I1oi1lio ioo0i1oi1lioI00000oIO = ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10I0000oI00.getClass());
/* 20 */                I1Il011OO i1Il011OO = new I1Il011OO();
/* 23 */                ili1iio0oiio.getClass();
/* 28 */                ioo0i1oi1lioI00000oIO.I000OOo1O(ilol10I0000oI00, bArr, 0, length, i1Il011OO);
/* 31 */                ioo0i1oi1lioI00000oIO.I00000oIO(ilol10I0000oI00);
/* 38 */                if (ilol10I0000oI00.I000iOII()) {
/* 40 */                    return (loO1IolO) ilol10I0000oI00;
                        }
/* 57 */                throw new ill0ll01OOOO(new ioo01i().getMessage());
                    } catch (ill0ll01OOOO e) {
/* 106 */               if (e.I00iOIl) {
/* 551 */                   throw new ill0ll01OOOO(e.getMessage(), e);
                        }
/* 551 */               throw e;
                    } catch (ioo01i e2) {
/* 101 */               throw new ill0ll01OOOO(e2.getMessage());
                    } catch (IOException e3) {
/* 71 */                if (e3.getCause() instanceof ill0ll01OOOO) {
/* 79 */                    throw ((ill0ll01OOOO) e3.getCause());
                        }
/* 89 */                throw new ill0ll01OOOO(e3.getMessage(), e3);
                    } catch (IndexOutOfBoundsException unused) {
/* 62 */                throw ill0ll01OOOO.I0001Ioi1lo();
                    }
                }

                public static void I001iOo1i0O(loO1IolO loo1iolo, String str) {
/* 1 */             str.getClass();
                    loo1iolo.zzd |= 2;
/* 10 */            loo1iolo.zzg = str;
                }

                public static void I001l0I00(loO1IolO loo1iolo, int i) {
                    loo1iolo.zzd |= 4;
/* 7 */             loo1iolo.zzh = i;
                }

                public static void I001lIiIIo1O(loO1IolO loo1iolo) {
/* 1 */             String str = Build.HARDWARE;
/* 3 */             str.getClass();
                    loo1iolo.zzd |= 8;
/* 12 */            loo1iolo.zzi = str;
                }

                public static void I001lllioOl(loO1IolO loo1iolo) {
/* 1 */             String str = Build.FINGERPRINT;
/* 3 */             str.getClass();
                    loo1iolo.zzd |= 16;
/* 12 */            loo1iolo.zzj = str;
                }

                public static void I001lloI(loO1IolO loo1iolo, ll0oOiiIi ll0ooiiii) {
/* 1 */             iliiiioo iliiiiooVarZzd = loo1iolo.zze;
/* 8 */             if (!((iilOi0ioo1) iliiiiooVarZzd).I00iOIl) {
/* 10 */                int size = iliiiiooVarZzd.size();
/* 20 */                iliiiiooVarZzd = iliiiiooVarZzd.zzd(size == 0 ? 10 : size + size);
/* 24 */                loo1iolo.zze = iliiiiooVarZzd;
                    }
/* 26 */            iliiiiooVarZzd.add(ll0ooiiii);
                }

                public static void I00II0Ol1O0l(loO1IolO loo1iolo, String str) {
/* 1 */             str.getClass();
                    loo1iolo.zzd |= 32;
/* 10 */            loo1iolo.zzk = str;
                }

                public static void I00II0oii1o(loO1IolO loo1iolo, String str) {
/* 1 */             str.getClass();
                    loo1iolo.zzd |= 1;
/* 10 */            loo1iolo.zzf = str;
                }

                @Override
                public final Object I000lI(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 68 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 62 */                return ilOl10.I000II(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"zzd", "zze", ll0oOiiIi.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new loO1IolO();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new lo00l1i1O1O(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final int I000oI1ioi() {
/* 1 */             return this.zzh;
                }

                public final String I0010o() {
/* 1 */             return this.zzf;
                }

                public final String I00111O() {
/* 1 */             return this.zzg;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.zzi;
                }

                public final String I001IO000() {
/* 1 */             return this.zzk;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzj;
                }

                public final iliiiioo I001i1lo1io() {
/* 1 */             return this.zze;
                }
            }
