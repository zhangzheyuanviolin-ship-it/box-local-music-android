            package p000;

            import java.io.IOException;
            
            public final class I1o1o0 extends illOil implements ioOI1Io1oo {
                private static final I1o1o0 zzb;
                private int zzd;
                private int zzf;
                private byte zzi = 2;
                private iloOl100 zze = ioiiOIllI.I00iio;
                private String zzg = "";
                private il1oII0OlIo zzh = il1oII0OlIo.I00iiI;

                static {
/* 3 */             I1o1o0 i1o1o0 = new I1o1o0();
/* 6 */             zzb = i1o1o0;
/* 10 */            illOil.I000OiO(I1o1o0.class, i1o1o0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [iooIIllo] */
                /* JADX WARN: Type inference failed for: r2v1, types: [illOil, java.lang.Object] */
                public static I1o1o0 I00100l0(byte[] bArr, ilOO1I1l iloo1i1l) throws iloll1i {
/* 1 */             I1o1o0 i1o1o0 = zzb;
/* 3 */             int length = bArr.length;
/* 5 */             if (length != 0) {
/* 14 */                ?? r2 = (illOil) i1o1o0.I000oI1ioi(4, null);
                        try {
/* 22 */                    ?? I00000oIO = ioiO0iOooii.I0000Il00O.I00000oIO(r2.getClass());
/* 28 */                    i111i0I1 i111i0i1 = new i111i0I1();
/* 31 */                    iloo1i1l.getClass();
/* 34 */                    i111i0i1.I0000oI00 = iloo1i1l;
/* 38 */                    I00000oIO.I000II(r2, bArr, 0, length, i111i0i1);
/* 41 */                    I00000oIO.I00000oIO(r2);
/* 44 */                    i1o1o0 = r2;
                        } catch (iloll1i e) {
/* 332 */                   throw e;
                        } catch (IOException e2) {
/* 88 */                    if (e2.getCause() instanceof iloll1i) {
/* 96 */                        throw ((iloll1i) e2.getCause());
                            }
/* 106 */                   throw new iloll1i(e2.getMessage(), e2);
                        } catch (IndexOutOfBoundsException unused) {
/* 76 */                    iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 4 */                     return null;
                        } catch (l010o0l0loO e3) {
/* 111 */                   iilo0lOo110.I0000oI00(e3.getMessage());
/* 4 */                     return null;
                        }
                    }
/* 45 */            if (i1o1o0 == null || illOil.I000l1(i1o1o0, true)) {
/* 68 */                return i1o1o0;
                    }
/* 64 */            iilo0lOo110.I0000oI00(new l010o0l0loO().getMessage());
/* 4 */             return null;
                }

                @Override
                public final Object I000oI1ioi(int i, illOil illoil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 74 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 67 */                return illOil.I000O01llI0(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", iil1I00o10.class, "zzf", iI1Il0l1O.I0000Il00O, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 41 */                return new I1o1o0();
                    }
/* 12 */            if (i2 == 4) {
/* 35 */                return new l1o0IOI0OO(14, zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzi = illoil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final iloOl100 I00100o1O0lo() {
/* 1 */             return this.zze;
                }
            }
