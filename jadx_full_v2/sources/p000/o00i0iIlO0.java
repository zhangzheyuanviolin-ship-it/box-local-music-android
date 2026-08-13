            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class o00i0iIlO0 extends o001IlOi0O implements o0IIiol0oIo {
                private static final o00i0iIlO0 zzb;
                private int zzd;
                private o0oOiOll11 zze;
                private byte zzf = 2;

                static {
/* 3 */             o00i0iIlO0 o00i0iilo0 = new o00i0iIlO0();
/* 6 */             zzb = o00i0iilo0;
/* 10 */            o001IlOi0O.I0001Ioi1lo(o00i0iIlO0.class, o00i0iilo0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [o0O1iOilloll] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o001IlOi0O] */
                public static o00i0iIlO0 I000oI1ioi(byte[] bArr, loo1Oo0 loo1oo0) throws o010O1 {
/* 1 */             o00i0iIlO0 o00i0iilo0 = zzb;
/* 3 */             int length = bArr.length;
/* 5 */             if (length != 0) {
/* 14 */                ?? r2 = (o001IlOi0O) o00i0iilo0.I000iOII(4, null);
                        try {
/* 22 */                    ?? I00000oIO = o0Ioolo.I0000Il00O.I00000oIO(r2.getClass());
/* 28 */                    i111i0I1 i111i0i1 = new i111i0I1();
/* 31 */                    i111i0i1.I0000oI00 = loo1oo0;
/* 33 */                    VarHandle.storeStoreFence();
/* 38 */                    I00000oIO.I0001Ioi1lo(r2, bArr, 0, length, i111i0i1);
/* 41 */                    I00000oIO.I00000oIO(r2);
/* 44 */                    o00i0iilo0 = r2;
                        } catch (IndexOutOfBoundsException unused) {
/* 76 */                    iilo0lOo110.I000O01llI0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 4 */                     return null;
                        } catch (o010O1 e) {
/* 332 */                   throw e;
                        } catch (IOException e2) {
/* 88 */                    if (e2.getCause() instanceof o010O1) {
/* 96 */                        throw ((o010O1) e2.getCause());
                            }
/* 106 */                   throw new o010O1(e2.getMessage(), e2);
                        } catch (o0OoIiioIool e3) {
/* 111 */                   iilo0lOo110.I000O01llI0(e3.getMessage());
/* 4 */                     return null;
                        }
                    }
/* 45 */            if (o00i0iilo0 == null || o001IlOi0O.I000O01llI0(o00i0iilo0, true)) {
/* 68 */                return o00i0iilo0;
                    }
/* 64 */            iilo0lOo110.I000O01llI0(new o0OoIiioIool().getMessage());
/* 4 */             return null;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return Byte.valueOf(this.zzf);
                    }
/* 6 */             if (i2 == 2) {
/* 55 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new o00i0iIlO0();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new o0lioo011l(3, zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzf = o001iloi0o == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final o0oOiOll11 I00100l0() {
/* 1 */             o0oOiOll11 o0ooioll11 = this.zze;
                    return o0ooioll11 == null ? o0oOiOll11.I000oI1ioi() : o0ooioll11;
                }
            }
