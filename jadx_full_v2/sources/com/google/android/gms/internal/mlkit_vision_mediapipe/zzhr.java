            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import java.util.ArrayList;
            import p000.ioiioIi0i0ol;
            import p000.lIi0II001O1I;
            import p000.lil0lI0lI1;
            
            public final class zzhr {
                public long I00000oIO;
                public zzhp I00000oOI;

                private final native byte[][] zzb(long j);

                public final ArrayList I00000oIO() {
                    synchronized (this.I00000oOI) {
                        try {
/* 22 */                    lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called already.", this.I00000oOI.zza() != 0);
/* 27 */                    byte[][] bArrZzb = zzb(this.I00000oIO);
/* 33 */                    ArrayList arrayList = new ArrayList();
/* 36 */                    if (bArrZzb == null) {
/* 39 */                        return arrayList;
                            }
/* 43 */                    for (byte[] bArr : bArrZzb) {
                                try {
/* 51 */                            arrayList.add(ioiioIi0i0ol.I000o00OoI0I(bArr));
                                } catch (lIi0II001O1I e) {
/* 63 */                            throw new RuntimeException(e);
                                }
                            }
/* 65 */                    return arrayList;
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }
            }
