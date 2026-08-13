            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class zzawi {
                private static final Object[][] zza = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
                private List zzb;
                private final zzatu zzc = zzatu.zza;
                private Object[][] zzd = zza;

                public final zzawi zza(zzawj zzawjVar, Object obj) {
/* 2 */             int length = 0;
                    while (true) {
/* 3 */                 Object[][] objArr = this.zzd;
/* 7 */                 if (length >= objArr.length) {
/* 23 */                    length = -1;
                            break;
                        }
/* 17 */                if (zzawjVar.equals(objArr[length][0])) {
                            break;
                        }
/* 20 */                length++;
                    }
/* 24 */            if (length == -1) {
/* 26 */                Object[][] objArr2 = this.zzd;
/* 28 */                int length2 = objArr2.length;
/* 45 */                Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
/* 47 */                System.arraycopy(objArr2, 0, objArr3, 0, length2);
/* 50 */                this.zzd = objArr3;
                        length = objArr3.length - 1;
                    }
/* 61 */            this.zzd[length] = new Object[]{zzawjVar, obj};
/* 106 */           return this;
                }

                public final zzawi zzb(List list) {
/* 9 */             zzgo.zzf(!list.isEmpty(), "addrs is empty");
/* 21 */            this.zzb = Collections.unmodifiableList(new ArrayList(list));
/* 29 */            return this;
                }

                public final zzawk zzc() {
/* 10 */            return new zzawk(this.zzb, this.zzc, this.zzd, null);
                }
            }
