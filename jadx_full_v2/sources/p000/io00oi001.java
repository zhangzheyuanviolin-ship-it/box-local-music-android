            package p000;
            
            public final class io00oi001 extends lIIOO0oi1o {
                private static final io00oi001 zzb;
                private int zzd;
                private String zze = "";
                private String zzf = "";
                private String zzg = "";

                static {
/* 3 */             io00oi001 io00oi001Var = new io00oi001();
/* 6 */             zzb = io00oi001Var;
/* 10 */            lIIOO0oi1o.I0000oI00(io00oi001.class, io00oi001Var);
                }

                public static io000O1i I000o00OoI0I() {
/* 11 */            return (io000O1i) ((lI1IliiIoIi) zzb.I000OiO(5, null));
                }

                public static void I000oI1ioi(io00oi001 io00oi001Var, String str) {
/* 1 */             str.getClass();
                    io00oi001Var.zzd |= 1;
/* 10 */            io00oi001Var.zze = str;
                }

                public static void I00100l0(io00oi001 io00oi001Var, String str) {
/* 1 */             str.getClass();
                    io00oi001Var.zzd |= 2;
/* 10 */            io00oi001Var.zzf = str;
                }

                @Override
                public final Object I000OiO(int i, lIIOO0oi1o liioo0oi1o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new lO1i1o0O0o(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new io00oi001();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new io000O1i(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
