            package p000;

            import android.content.SharedPreferences;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Il0IoIIl implements SharedPreferences {
                public SharedPreferences I00000oIO;
                public CopyOnWriteArrayList I00000oOI;
                public I0OIilIIo0 I0000Il00O;
                public IiOoOl0oIOi I0000O;

                public static boolean I0000Il00O(String str) {
                    return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
                }

                public final String I00000oIO(String str) {
/* 1 */             if (str == null) {
/* 3 */                 str = "__NULL__";
                    }
                    try {
                        try {
/* 31 */                    return new String(I1oI0o0oO.I00000oOI(this.I0000O.I00000oIO(str.getBytes(StandardCharsets.UTF_8), "box_security_enc".getBytes())), "US-ASCII");
                        } catch (UnsupportedEncodingException e) {
/* 41 */                    throw new AssertionError(e);
                        }
                    } catch (GeneralSecurityException e2) {
/* 49 */                IioIoO10iOiI.I000l1("Could not encrypt key. ", e2.getMessage(), e2);
/* 52 */                return null;
                    }
                }

                public final Object I00000oOI(String str) {
                    String str2;
/* 9 */             if (I0000Il00O(str)) {
/* 308 */               throw new SecurityException(Oi010OO0.I00111O(str, " is a reserved key for the encryption keyset."));
                    }
/* 13 */            if (str == null) {
/* 11 */                str = "__NULL__";
                    }
                    try {
/* 17 */                String strI00000oIO = I00000oIO(str);
/* 23 */                String string = this.I00000oIO.getString(strI00000oIO, null);
/* 27 */                if (string != null) {
/* 31 */                    byte[] bArrI00000oIO = I1oI0o0oO.I00000oIO(string);
/* 35 */                    I0OIilIIo0 i0OIilIIo0 = this.I0000Il00O;
/* 37 */                    Charset charset = StandardCharsets.UTF_8;
/* 47 */                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(i0OIilIIo0.I00000oOI(bArrI00000oIO, strI00000oIO.getBytes(charset)));
/* 52 */                    byteBufferWrap.position(0);
/* 55 */                    int i = byteBufferWrap.getInt();
/* 88 */                    int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
/* 89 */                    if (i2 == 0) {
/* 286 */                       throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                            }
/* 91 */                    int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i2);
/* 95 */                    if (iI001lIiIIo1O == 0) {
/* 242 */                       int i3 = byteBufferWrap.getInt();
/* 246 */                       ByteBuffer byteBufferSlice = byteBufferWrap.slice();
/* 250 */                       byteBufferWrap.limit(i3);
/* 257 */                       String string2 = charset.decode(byteBufferSlice).toString();
/* 265 */                       if (!string2.equals("__NULL__")) {
/* 268 */                           return string2;
                                }
                            } else {
/* 97 */                        if (iI001lIiIIo1O != 1) {
/* 99 */                            if (iI001lIiIIo1O == 2) {
/* 177 */                               return Integer.valueOf(byteBufferWrap.getInt());
                                    }
/* 101 */                           if (iI001lIiIIo1O == 3) {
/* 168 */                               return Long.valueOf(byteBufferWrap.getLong());
                                    }
/* 103 */                           if (iI001lIiIIo1O == 4) {
/* 159 */                               return Float.valueOf(byteBufferWrap.getFloat());
                                    }
/* 105 */                           if (iI001lIiIIo1O == 5) {
/* 114 */                               return Boolean.valueOf(byteBufferWrap.get() != 0);
                                    }
                                    switch (i2) {
                                        case 1:
/* 145 */                                   str2 = "STRING";
                                            break;
                                        case 2:
/* 142 */                                   str2 = "STRING_SET";
                                            break;
                                        case 3:
/* 139 */                                   str2 = "INT";
                                            break;
                                        case 4:
/* 136 */                                   str2 = "LONG";
                                            break;
                                        case 5:
/* 133 */                                   str2 = "FLOAT";
                                            break;
                                        case 6:
/* 130 */                                   str2 = "BOOLEAN";
                                            break;
                                        default:
/* 127 */                                   str2 = "null";
                                            break;
                                    }
/* 154 */                           throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                                }
/* 184 */                       I1Io1oIoo i1Io1oIoo = new I1Io1oIoo(0);
/* 191 */                       while (byteBufferWrap.hasRemaining()) {
/* 193 */                           int i4 = byteBufferWrap.getInt();
/* 197 */                           ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
/* 201 */                           byteBufferSlice2.limit(i4);
/* 209 */                           byteBufferWrap.position(byteBufferWrap.position() + i4);
/* 222 */                           i1Io1oIoo.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                                }
/* 228 */                       if (i1Io1oIoo.I00iiO != 1 || !"__NULL__".equals(i1Io1oIoo.I00iiI[0])) {
/* 241 */                           return i1Io1oIoo;
                                }
                            }
                        }
/* 16 */                return null;
                    } catch (GeneralSecurityException e) {
/* 293 */               IioIoO10iOiI.I000l1("Could not decrypt value. ", e.getMessage(), e);
/* 16 */                return null;
                    }
                }

                @Override
                public final boolean contains(String str) {
/* 5 */             if (I0000Il00O(str)) {
/* 29 */                throw new SecurityException(Oi010OO0.I00111O(str, " is a reserved key for the encryption keyset."));
                    }
/* 13 */            return this.I00000oIO.contains(I00000oIO(str));
                }

                @Override
                public final SharedPreferences.Editor edit() {
/* 5 */             SharedPreferences.Editor editorEdit = this.I00000oIO.edit();
/* 9 */             Il0Il1liIo il0Il1liIo = new Il0Il1liIo();
/* 18 */            il0Il1liIo.I0000O = new AtomicBoolean(false);
/* 20 */            il0Il1liIo.I00000oIO = this;
/* 22 */            il0Il1liIo.I00000oOI = editorEdit;
/* 29 */            il0Il1liIo.I0000Il00O = new CopyOnWriteArrayList();
/* 31 */            VarHandle.storeStoreFence();
/* 55 */            return il0Il1liIo;
                }

                @Override
                public final Map getAll() {
/* 3 */             HashMap map = new HashMap();
/* 24 */            for (Map.Entry<String, ?> entry : this.I00000oIO.getAll().entrySet()) {
/* 42 */                if (!I0000Il00O(entry.getKey())) {
                            try {
/* 71 */                        String str = new String(this.I0000O.I00000oOI(I1oI0o0oO.I00000oIO(entry.getKey()), "box_security_enc".getBytes()), StandardCharsets.UTF_8);
/* 80 */                        String str2 = str.equals("__NULL__") ? null : str;
/* 88 */                        map.put(str2, I00000oOI(str2));
                            } catch (GeneralSecurityException e) {
/* 99 */                        IioIoO10iOiI.I000l1("Could not decrypt key. ", e.getMessage(), e);
/* 50 */                        return null;
                            }
                        }
                    }
/* 110 */           return map;
                }

                @Override
                public final boolean getBoolean(String str, boolean z) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
                    return objI00000oOI instanceof Boolean ? ((Boolean) objI00000oOI).booleanValue() : z;
                }

                @Override
                public final float getFloat(String str, float f) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
                    return objI00000oOI instanceof Float ? ((Float) objI00000oOI).floatValue() : f;
                }

                @Override
                public final int getInt(String str, int i) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
                    return objI00000oOI instanceof Integer ? ((Integer) objI00000oOI).intValue() : i;
                }

                @Override
                public final long getLong(String str, long j) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
                    return objI00000oOI instanceof Long ? ((Long) objI00000oOI).longValue() : j;
                }

                @Override
                public final String getString(String str, String str2) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
                    return objI00000oOI instanceof String ? (String) objI00000oOI : str2;
                }

                @Override
                public final Set getStringSet(String str, Set set) {
/* 1 */             Object objI00000oOI = I00000oOI(str);
/* 15 */            Set i1Io1oIoo = objI00000oOI instanceof Set ? (Set) objI00000oOI : new I1Io1oIoo(0);
                    return i1Io1oIoo.size() > 0 ? i1Io1oIoo : set;
                }

                @Override
                public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.I00000oOI.add(onSharedPreferenceChangeListener);
                }

                @Override
                public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.I00000oOI.remove(onSharedPreferenceChangeListener);
                }
            }
