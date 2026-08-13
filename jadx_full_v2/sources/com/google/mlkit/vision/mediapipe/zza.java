            package com.google.mlkit.vision.mediapipe;

            import java.util.List;
            import java.util.Map;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.IOOlIIilOl0;
            import p000.O1o0111OI00;
            
            final class zza extends MediaPipeGraphRunnerConfig {
                private final O1o0111OI00 zza;
                private final String zzb;
                private final List zzc;
                private final List zzd;
                private final Map zze;
                private final Map zzf;

                public zza(O1o0111OI00 o1o0111OI00, String str, List list, List list2, Map map, Map map2) {
/* 5 */             if (o1o0111OI00 == null) {
/* 46 */                IOOlIIilOl0.I000II("Null mlKitContext");
/* 1294 */              throw null;
                    }
/* 7 */             this.zza = o1o0111OI00;
/* 9 */             if (str == null) {
/* 40 */                IOOlIIilOl0.I000II("Null graphConfigPath");
/* 43 */                throw null;
                    }
/* 11 */            this.zzb = str;
/* 13 */            if (list == null) {
/* 34 */                IOOlIIilOl0.I000II("Null inputFrameStreamNameList");
/* 37 */                throw null;
                    }
/* 15 */            this.zzc = list;
/* 17 */            if (list2 == null) {
/* 28 */                IOOlIIilOl0.I000II("Null outputStreamNameList");
/* 31 */                throw null;
                    }
/* 19 */            this.zzd = list2;
/* 21 */            this.zze = map;
/* 23 */            this.zzf = map2;
                }

                public final boolean equals(Object obj) {
                    Map map;
                    Map map2;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof MediaPipeGraphRunnerConfig) {
/* 10 */                MediaPipeGraphRunnerConfig mediaPipeGraphRunnerConfig = (MediaPipeGraphRunnerConfig) obj;
/* 22 */                if (this.zza.equals(mediaPipeGraphRunnerConfig.zza()) && this.zzb.equals(mediaPipeGraphRunnerConfig.zzb()) && this.zzc.equals(mediaPipeGraphRunnerConfig.zzc()) && this.zzd.equals(mediaPipeGraphRunnerConfig.zzd()) && ((map = this.zze) != null ? map.equals(mediaPipeGraphRunnerConfig.zze()) : mediaPipeGraphRunnerConfig.zze() == null) && ((map2 = this.zzf) != null ? map2.equals(mediaPipeGraphRunnerConfig.zzf()) : mediaPipeGraphRunnerConfig.zzf() == null)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 34 */            int iHashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
/* 35 */            Map map = this.zze;
/* 48 */            int iHashCode2 = ((iHashCode * 1000003) ^ (map == null ? 0 : map.hashCode())) * 1000003;
/* 49 */            Map map2 = this.zzf;
/* 58 */            return iHashCode2 ^ (map2 != null ? map2.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             Map map = this.zzf;
/* 3 */             Map map2 = this.zze;
/* 5 */             List list = this.zzd;
/* 7 */             List list2 = this.zzc;
/* 11 */            String string = this.zza.toString();
/* 15 */            String string2 = list2.toString();
/* 19 */            String string3 = list.toString();
/* 23 */            String strValueOf = String.valueOf(map2);
/* 27 */            String strValueOf2 = String.valueOf(map);
/* 35 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("MediaPipeGraphRunnerConfig{mlKitContext=", string, ", graphConfigPath=");
/* 45 */            IIl001iO0Io.I001lIiIIo1O(sbI001IIilI0O, this.zzb, ", inputFrameStreamNameList=", string2, ", outputStreamNameList=");
/* 52 */            IIl001iO0Io.I001lIiIIo1O(sbI001IIilI0O, string3, ", assetRegistry=", strValueOf, ", inputSidePackets=");
/* 57 */            return IIl001iO0Io.I00100l0(sbI001IIilI0O, strValueOf2, "}");
                }

                @Override
                public final O1o0111OI00 zza() {
/* 1 */             return this.zza;
                }

                @Override
                public final String zzb() {
/* 1 */             return this.zzb;
                }

                @Override
                public final List zzc() {
/* 1 */             return this.zzc;
                }

                @Override
                public final List zzd() {
/* 1 */             return this.zzd;
                }

                @Override
                public final Map zze() {
/* 1 */             return this.zze;
                }

                @Override
                public final Map zzf() {
/* 1 */             return this.zzf;
                }
            }
