            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.Oi010OO0;
            
            public final class zzavj {
                public static final zzats zza = zzats.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
                public static final zzats zzb = zzats.zza("io.grpc.EquivalentAddressGroup.LOCALITY");
                private final List zzc;
                private final zzatu zzd;
                private final int zze;

                public zzavj(List list, zzatu zzatuVar) {
/* 12 */            zzgo.zzf(!list.isEmpty(), "addrs is empty");
/* 20 */            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
/* 24 */            this.zzc = listUnmodifiableList;
/* 28 */            zzgo.zzc(zzatuVar, "attrs");
/* 31 */            this.zzd = zzatuVar;
/* 37 */            this.zze = listUnmodifiableList.hashCode();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzavj)) {
/* 7 */                 return false;
                    }
/* 11 */            zzavj zzavjVar = (zzavj) obj;
/* 13 */            List list = this.zzc;
/* 15 */            int size = list.size();
/* 19 */            List list2 = zzavjVar.zzc;
/* 25 */            if (size != list2.size()) {
/* 7 */                 return false;
                    }
/* 32 */            for (int i = 0; i < list.size(); i++) {
/* 48 */                if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
/* 7 */                     return false;
                        }
                    }
                    return this.zzd.equals(zzavjVar.zzd);
                }

                public final int hashCode() {
/* 1 */             return this.zze;
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("[", String.valueOf(this.zzc), "/", this.zzd.toString(), "]");
                }

                public final zzatu zza() {
/* 1 */             return this.zzd;
                }

                public final List zzb() {
/* 1 */             return this.zzc;
                }
            }
