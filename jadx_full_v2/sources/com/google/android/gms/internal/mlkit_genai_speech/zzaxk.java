            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.StandardCharsets;
            import java.util.BitSet;
            import java.util.Locale;
            import java.util.logging.Level;
            import p000.I000II;
            import p000.IIl001iO0Io;
            
            public abstract class zzaxk {
                public static final int zza = 0;
                private static final BitSet zzb;
                private final String zzc;
                private final String zzd;
                private final byte[] zze;
                private final Object zzf;

                static {
/* 5 */             BitSet bitSet = new BitSet(127);
/* 10 */            bitSet.set(45);
/* 15 */            bitSet.set(95);
/* 20 */            bitSet.set(46);
/* 27 */            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
/* 29 */                bitSet.set(c);
                    }
/* 40 */            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
/* 42 */                bitSet.set(c2);
                    }
/* 49 */            zzb = bitSet;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public zzaxk(String str, boolean z, Object obj, zzaxp zzaxpVar) {
/* 4 */             this.zzc = str;
/* 8 */             String lowerCase = str.toLowerCase(Locale.ROOT);
/* 14 */            zzgo.zzc(lowerCase, "name");
/* 25 */            zzgo.zzf(!lowerCase.isEmpty(), "token must have at least 1 tchar");
/* 35 */            if (lowerCase.equals("connection")) {
/* 56 */                zzaxq.zzc.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
                    }
/* 59 */            int i = 0;
/* 64 */            while (i < lowerCase.length()) {
/* 66 */                char cCharAt = lowerCase.charAt(i);
/* 70 */                if (z && cCharAt == ':') {
/* 76 */                    if (i == 0) {
/* 78 */                        i = 0;
                            } else {
/* 80 */                        cCharAt = ':';
/* 87 */                        if (zzb.get(cCharAt)) {
                                }
                            }
                        } else if (zzb.get(cCharAt)) {
/* 106 */                   I000II.I000iOII(zzgt.zzb("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
/* 110 */                   throw null;
                        }
/* 89 */                i++;
                    }
/* 111 */           this.zzd = lowerCase;
/* 119 */           this.zze = lowerCase.getBytes(StandardCharsets.US_ASCII);
/* 121 */           this.zzf = obj;
                }

                public static zzaxk zzc(String str, zzaxi zzaxiVar) {
/* 5 */             return new zzaxh(str, false, zzaxiVar, null);
                }

                public static zzaxk zzd(String str, zzaxj zzaxjVar) {
/* 4 */             return new zzaxl(str, zzaxjVar, null);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 29 */                return false;
                    }
/* 24 */            return this.zzd.equals(((zzaxk) obj).zzd);
                }

                public final int hashCode() {
/* 3 */             return this.zzd.hashCode();
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("Key{name='"), this.zzd, "'}");
                }

                public abstract Object zza(byte[] bArr);

                public abstract byte[] zzb(Object obj);

                public final Object zze(Class cls) {
/* 1 */             Object obj = this.zzf;
/* 7 */             if (cls.isInstance(obj)) {
/* 9 */                 return cls.cast(obj);
                    }
/* 14 */            return null;
                }

                public boolean zzf() {
/* 1 */             return false;
                }

                public final byte[] zzg() {
/* 1 */             return this.zze;
                }
            }
