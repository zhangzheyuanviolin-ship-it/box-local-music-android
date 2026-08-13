            package p000;

            import android.content.SharedPreferences;
            import android.util.Pair;
            import java.io.UnsupportedEncodingException;
            import java.nio.ByteBuffer;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Il0Il1liIo implements SharedPreferences.Editor {
                public Il0IoIIl I00000oIO;
                public SharedPreferences.Editor I00000oOI;
                public CopyOnWriteArrayList I0000Il00O;
                public AtomicBoolean I0000O;

                public final void I00000oIO() {
/* 1 */             Il0IoIIl il0IoIIl = this.I00000oIO;
/* 10 */            if (this.I0000O.getAndSet(false)) {
/* 30 */                for (String str : ((HashMap) il0IoIIl.getAll()).keySet()) {
/* 44 */                    if (!this.I0000Il00O.contains(str) && !Il0IoIIl.I0000Il00O(str)) {
/* 58 */                        this.I00000oOI.remove(il0IoIIl.I00000oIO(str));
                            }
                        }
                    }
                }

                public final void I00000oOI() {
/* 1 */             Il0IoIIl il0IoIIl = this.I00000oIO;
/* 5 */             Iterator it = il0IoIIl.I00000oOI.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
/* 23 */                Iterator it2 = this.I0000Il00O.iterator();
/* 31 */                while (it2.hasNext()) {
/* 39 */                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(il0IoIIl, (String) it2.next());
                        }
                    }
                }

                public final void I0000Il00O(String str, byte[] bArr) {
/* 1 */             Il0IoIIl il0IoIIl = this.I00000oIO;
/* 3 */             il0IoIIl.getClass();
/* 10 */            if (Il0IoIIl.I0000Il00O(str)) {
/* 106 */               throw new SecurityException(Oi010OO0.I00111O(str, " is a reserved key for the encryption keyset."));
                    }
/* 14 */            this.I0000Il00O.add(str);
/* 17 */            if (str == null) {
/* 19 */                str = "__NULL__";
                    }
                    try {
/* 21 */                String strI00000oIO = il0IoIIl.I00000oIO(str);
                        try {
/* 50 */                    Pair pair = new Pair(strI00000oIO, new String(I1oI0o0oO.I00000oOI(il0IoIIl.I0000Il00O.I00000oIO(bArr, strI00000oIO.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
/* 63 */                    this.I00000oOI.putString((String) pair.first, (String) pair.second);
                        } catch (UnsupportedEncodingException e) {
/* 75 */                    throw new AssertionError(e);
                        }
                    } catch (GeneralSecurityException e2) {
/* 82 */                IioIoO10iOiI.I000l1("Could not encrypt data: ", e2.getMessage(), e2);
                    }
                }

                @Override
                public final void apply() {
/* 1 */             I00000oIO();
/* 6 */             this.I00000oOI.apply();
/* 9 */             I00000oOI();
/* 14 */            this.I0000Il00O.clear();
                }

                @Override
                public final SharedPreferences.Editor clear() {
/* 4 */             this.I0000O.set(true);
/* 20 */            return this;
                }

                @Override
                public final boolean commit() {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I0000Il00O;
/* 3 */             I00000oIO();
                    try {
/* 8 */                 return this.I00000oOI.commit();
                    } finally {
/* 20 */                I00000oOI();
/* 23 */                copyOnWriteArrayList.clear();
                    }
                }

                @Override
                public final SharedPreferences.Editor putBoolean(String str, boolean z) {
/* 2 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
/* 6 */             byteBufferAllocate.putInt(5);
/* 9 */             byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
/* 16 */            I0000Il00O(str, byteBufferAllocate.array());
/* 37 */            return this;
                }

                @Override
                public final SharedPreferences.Editor putFloat(String str, float f) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
/* 8 */             byteBufferAllocate.putInt(4);
/* 11 */            byteBufferAllocate.putFloat(f);
/* 18 */            I0000Il00O(str, byteBufferAllocate.array());
/* 37 */            return this;
                }

                @Override
                public final SharedPreferences.Editor putInt(String str, int i) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
/* 8 */             byteBufferAllocate.putInt(2);
/* 11 */            byteBufferAllocate.putInt(i);
/* 18 */            I0000Il00O(str, byteBufferAllocate.array());
/* 37 */            return this;
                }

                @Override
                public final SharedPreferences.Editor putLong(String str, long j) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
/* 8 */             byteBufferAllocate.putInt(3);
/* 11 */            byteBufferAllocate.putLong(j);
/* 18 */            I0000Il00O(str, byteBufferAllocate.array());
/* 37 */            return this;
                }

                @Override
                public final SharedPreferences.Editor putString(String str, String str2) {
/* 1 */             if (str2 == null) {
/* 3 */                 str2 = "__NULL__";
                    }
/* 7 */             byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
/* 11 */            int length = bytes.length;
/* 14 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
/* 19 */            byteBufferAllocate.putInt(0);
/* 22 */            byteBufferAllocate.putInt(length);
/* 25 */            byteBufferAllocate.put(bytes);
/* 32 */            I0000Il00O(str, byteBufferAllocate.array());
/* 37 */            return this;
                }

                @Override
                public final SharedPreferences.Editor putStringSet(String str, Set set) {
/* 1 */             if (set == null) {
/* 6 */                 set = new I1Io1oIoo(0);
/* 11 */                set.add("__NULL__");
                    }
/* 20 */            ArrayList arrayList = new ArrayList(set.size());
/* 27 */            int size = set.size() * 4;
/* 29 */            Iterator it = set.iterator();
/* 37 */            while (it.hasNext()) {
/* 47 */                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
/* 51 */                arrayList.add(bytes);
/* 55 */                size += bytes.length;
                    }
/* 59 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
/* 64 */            byteBufferAllocate.putInt(1);
/* 67 */            Iterator it2 = arrayList.iterator();
/* 75 */            while (it2.hasNext()) {
/* 81 */                byte[] bArr = (byte[]) it2.next();
/* 84 */                byteBufferAllocate.putInt(bArr.length);
/* 87 */                byteBufferAllocate.put(bArr);
                    }
/* 95 */            I0000Il00O(str, byteBufferAllocate.array());
/* 106 */           return this;
                }

                @Override
                public final SharedPreferences.Editor remove(String str) {
/* 1 */             Il0IoIIl il0IoIIl = this.I00000oIO;
/* 3 */             il0IoIIl.getClass();
/* 10 */            if (Il0IoIIl.I0000Il00O(str)) {
/* 77 */                throw new SecurityException(Oi010OO0.I00111O(str, " is a reserved key for the encryption keyset."));
                    }
/* 18 */            this.I00000oOI.remove(il0IoIIl.I00000oIO(str));
/* 23 */            this.I0000Il00O.add(str);
/* 26 */            return this;
                }
            }
