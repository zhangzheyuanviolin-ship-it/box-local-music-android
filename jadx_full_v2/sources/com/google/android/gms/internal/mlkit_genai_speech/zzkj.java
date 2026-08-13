            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.pm.PackageManager;
            import p000.Io0ii1o0;
            
            final class zzkj extends zzbab {
                final PackageManager zza;
                final zzho zzb;
                final Io0ii1o0 zzc;

                public zzkj(PackageManager packageManager, zzho zzhoVar, Io0ii1o0 io0ii1o0) {
/* 1 */             this.zza = packageManager;
/* 3 */             this.zzb = zzhoVar;
/* 5 */             this.zzc = io0ii1o0;
                }

                @Override
                public final zzazd zza(int i) {
/* 3 */             String[] packagesForUid = this.zza.getPackagesForUid(i);
/* 7 */             if (packagesForUid != null) {
/* 11 */                for (String str : packagesForUid) {
/* 21 */                    if (this.zzb.contains(str)) {
                                return !this.zzc.I00000oOI(i) ? zzazd.zze.zze("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : zzazd.zza;
                            }
                        }
                    }
/* 50 */            return zzazd.zze.zze("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
                }
            }
