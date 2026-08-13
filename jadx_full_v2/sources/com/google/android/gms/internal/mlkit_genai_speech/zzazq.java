            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.ComponentName;
            import android.content.Intent;
            import android.os.UserHandle;
            import java.net.SocketAddress;
            import java.util.Objects;
            
            public final class zzazq extends SocketAddress {
                private final Intent zza;
                private final UserHandle zzb;

                private zzazq(Intent intent, UserHandle userHandle) {
/* 8 */             boolean z = true;
/* 9 */             if (intent.getComponent() == null && intent.getPackage() == null) {
/* 18 */                z = false;
                    }
/* 21 */            zzgo.zzf(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
/* 24 */            this.zza = intent;
/* 26 */            this.zzb = userHandle;
                }

                public static zzazq zzc(ComponentName componentName) {
/* 15 */            return new zzazq(new Intent("grpc.io.action.BIND").setComponent(componentName), null);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzazq) {
/* 6 */                 zzazq zzazqVar = (zzazq) obj;
/* 16 */                if (this.zza.filterEquals(zzazqVar.zza) && Objects.equals(this.zzb, zzazqVar.zzb)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             Intent intent = this.zza;
/* 7 */             if (intent.getPackage() != null) {
/* 14 */                intent = intent.cloneFilter().setPackage(null);
                    }
/* 18 */            return intent.filterHashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AndroidComponentAddress[");
/* 8 */             UserHandle userHandle = this.zzb;
/* 10 */            if (userHandle != null) {
/* 12 */                sb.append(userHandle);
/* 17 */                sb.append("@");
                    }
/* 22 */            sb.append(this.zza);
/* 27 */            sb.append("]");
/* 30 */            return sb.toString();
                }

                public final Intent zza() {
/* 3 */             return this.zza.cloneFilter();
                }

                public final UserHandle zzb() {
/* 1 */             return this.zzb;
                }

                public final String zzd() {
/* 1 */             Intent intent = this.zza;
                    return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
                }
            }
