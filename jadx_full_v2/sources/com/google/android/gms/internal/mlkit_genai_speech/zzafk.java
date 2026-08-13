            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.util.Locale;
            import p000.Oi010OO0;
            
/* 34 */    public final class zzafk extends IOException {
                /* JADX WARN: Illegal instructions before constructor call */
                public zzafk(long j, long j2, int i, Throwable th) {
/* 1 */             Locale locale = Locale.US;
/* 7 */             StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "Pos: ", ", limit: ");
/* 11 */            sbI001iOo1i0O.append(j2);
/* 16 */            sbI001iOo1i0O.append(", len: ");
/* 19 */            sbI001iOo1i0O.append(i);
/* 32 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbI001iOo1i0O.toString()), th);
                }

/* 35 */        public zzafk() {
/* 36 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
                }

/* 36 */        public zzafk(Throwable th) {
/* 37 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
                }
            }
