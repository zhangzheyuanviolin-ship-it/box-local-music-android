            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Map;
            
            final class zzagu implements Iterator {
                private final Iterator zza;

                public zzagu(Iterator it) {
/* 4 */             this.zza = it;
                }

                @Override
                public final boolean hasNext() {
/* 3 */             return this.zza.hasNext();
                }

                @Override
                public final Object next() {
/* 7 */             Map.Entry entry = (Map.Entry) this.zza.next();
                    return entry.getValue() instanceof zzagw ? new zzagt(entry, null) : entry;
                }

                @Override
                public final void remove() {
/* 3 */             this.zza.remove();
                }
            }
