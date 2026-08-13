            package p000;

            import androidx.work.impl.model.WorkSpec;
            import com.google.android.gms.internal.mlkit_genai_speech.zzagq;
            import com.google.android.gms.internal.mlkit_genai_speech.zzagr;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.List;
            
            public final class OoOil11Ol1o implements OoooioIi0I, Illill0o, O0OI1I001l0l {
                public static void I0000Il00O() {
/* 29 */            throw new AssertionError();
                }

                public static void I0000O(int i, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Length too large: ");
/* 11 */            sb.append(i2);
/* 14 */            sb.append(i2);
/* 89 */            throw new IllegalArgumentException(sb.toString());
                }

                public static void I0000oI00(int i, int i2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Ran off end of other: 0, ");
/* 11 */            sb.append(i2);
/* 16 */            sb.append((Object) ", ");
/* 19 */            sb.append(i3);
/* 215 */           throw new IllegalArgumentException(sb.toString());
                }

                public static void I0001Ioi1lo(int i, Object obj, int i2, Object obj2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 6 */             sb.append(obj);
/* 9 */             sb.append(i2);
/* 12 */            sb.append(obj2);
/* 15 */            sb.append(i3);
/* 966 */           throw new IndexOutOfBoundsException(sb.toString());
                }

                public static void I000II(long j) {
/* 49 */            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
                }

                public static void I000O01llI0(Object obj, int i, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Source subfield ");
/* 11 */            sb.append(i2);
/* 16 */            sb.append((Object) " is present but null: ");
/* 19 */            sb.append(obj);
/* 215 */           throw new IllegalStateException(sb.toString());
                }

                public static void I000OOo1O(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalArgumentException(str + obj + obj2);
                }

                public static void I000OiO(String str) {
/* 49 */            throw new UnsupportedOperationException(str);
                }

                public static void I000iOII(String str, Object obj) {
/* 89 */            throw new UnsupportedOperationException(str + obj);
                }

                public static void I000l1(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new IllegalStateException(str + obj + obj2 + obj3);
                }

                public static void I000lI(String str, Object obj, Throwable th) {
/* 215 */           throw new RuntimeException(str + obj, th);
                }

                public static void I000o00OoI0I(String str, Object[] objArr) {
/* 89 */            throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
                }

                public static void I000oI1ioi(Throwable th) {
/* 49 */            throw new IllegalStateException(th);
                }

                public static void I00100l0() throws iI00ilIl1I {
/* 29 */            throw new iI00ilIl1I();
                }

                public static void I00100o1O0lo(int i, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "serialized size must be non-negative, was ");
/* 11 */            sb.append(i2);
/* 89 */            throw new IllegalStateException(sb.toString());
                }

                public static void I0010I0i(String str) {
/* 49 */            throw new ArrayIndexOutOfBoundsException(str);
                }

                public static void I0010o(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new IllegalArgumentException(str + obj + obj2 + obj3);
                }

                public static void I00111O() throws zzagq {
/* 29 */            throw new zzagq("Protocol message tag had invalid wire type.");
                }

                public static void I001IIilI0O(String str) throws i11i01Oo {
/* 49 */            throw new i11i01Oo(str);
                }

                public static void I001IO000() throws ii0iI0IiOo {
/* 29 */            throw new ii0iI0IiOo();
                }

                public static void I001i1O0Ol(String str) throws zzagr {
/* 49 */            throw new zzagr(str);
                }

                public static void I001i1lo1io() {
/* 29 */            throw new IndexOutOfBoundsException();
                }

                public static void I001iOo1i0O(String str) throws ii0iI11ol {
/* 49 */            throw new ii0iI11ol(str);
                }

                @Override
                public OoI0llll I00000oIO(I1111OO10i i1111OO10i) {
/* 5 */             return new OoI0llll(i1111OO10i, OIOlO0iIO.I00000oIO);
                }

                @Override
                public l0il1i0011O I00000oOI(Oili0i1IOo oili0i1IOo) throws GeneralSecurityException {
                    Io1lOlI io1lOlI;
/* 1 */             OOi1OoI0loOi oOi1OoI0loOi = (OOi1OoI0loOi) oili0i1IOo;
/* 12 */            if (!oOi1OoI0loOi.I00000oIO.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
/* 128 */               I000II.I000iOII("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
/* 11 */                return null;
                    }
                    try {
/* 20 */                i01lolol i01lololVarI001lllioOl = i01lolol.I001lllioOl(oOi1OoI0loOi.I0000Il00O, Il1llO11O.I00000oIO());
/* 28 */                if (i01lololVarI001lllioOl.I001l0I00() != 0) {
/* 119 */                   throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
/* 30 */                OIl1lli oIl1lli = oOi1OoI0loOi.I0000oI00;
/* 32 */                int iOrdinal = oIl1lli.ordinal();
/* 37 */                if (iOrdinal == 1) {
/* 79 */                    io1lOlI = Io1lOlI.I000II;
                        } else if (iOrdinal == 2) {
/* 76 */                    io1lOlI = Io1lOlI.I000O01llI0;
                        } else if (iOrdinal == 3) {
/* 73 */                    io1lOlI = Io1lOlI.I000OOo1O;
                        } else {
/* 46 */                    if (iOrdinal != 4) {
/* 72 */                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli.I00000oOI());
                            }
/* 76 */                    io1lOlI = Io1lOlI.I000O01llI0;
                        }
/* 91 */                IIOIlli0IO iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(i01lololVarI001lllioOl.I001iOo1i0O().I000OiO());
/* 97 */                O1OIll00i o1OIll00i = new O1OIll00i(22);
/* 100 */               o1OIll00i.I00iiI = iIOIlli0IOI00000oIO;
/* 102 */               VarHandle.storeStoreFence();
/* 107 */               return i01o0iOO.I00000oIO(io1lOlI, o1OIll00i, oOi1OoI0loOi.I0001Ioi1lo);
                    } catch (O000oiiiOI0 unused) {
/* 122 */               IioIoO10iOiI.I000oI1ioi("Parsing XChaCha20Poly1305Key failed");
/* 11 */                return null;
                    }
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
                }
            }
