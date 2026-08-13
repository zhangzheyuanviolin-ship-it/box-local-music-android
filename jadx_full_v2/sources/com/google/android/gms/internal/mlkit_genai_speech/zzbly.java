            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            final class zzbly {
                final boolean zza;
                final List zzb;
                final Collection zzc;
                final Collection zzd;
                final int zze;
                final zzbmh zzf;
                final boolean zzg;
                final boolean zzh;

                public zzbly(List list, Collection collection, Collection collection2, zzbmh zzbmhVar, boolean z, boolean z2, boolean z3, int i) {
/* 4 */             this.zzb = list;
/* 8 */             zzgo.zzc(collection, "drainedSubstreams");
/* 14 */            this.zzc = collection;
/* 16 */            this.zzf = zzbmhVar;
/* 18 */            this.zzd = collection2;
/* 20 */            this.zzg = z;
/* 22 */            this.zza = z2;
/* 24 */            this.zzh = z3;
/* 26 */            this.zze = i;
/* 39 */            zzgo.zzn(!z2 || list == null, "passThrough should imply buffer is null");
/* 51 */            zzgo.zzn((z2 && zzbmhVar == null) ? false : true, "passThrough should imply winningSubstream != null");
/* 85 */            zzgo.zzn(!z2 || (collection.size() == 1 && collection.contains(zzbmhVar)) || (collection.size() == 0 && zzbmhVar.zzb), "passThrough should imply winningSubstream is drained");
/* 95 */            zzgo.zzn((z && zzbmhVar == null) ? false : true, "cancelled should imply committed");
                }

                public final zzbly zza(zzbmh zzbmhVar) {
                    Collection collectionUnmodifiableCollection;
/* 1 */             boolean z = this.zzh;
/* 7 */             zzgo.zzn(!z, "hedging frozen");
/* 10 */            zzbmh zzbmhVar2 = this.zzf;
/* 20 */            zzgo.zzn(zzbmhVar2 == null, "already committed");
/* 23 */            Collection collection = this.zzd;
/* 25 */            if (collection == null) {
/* 27 */                collectionUnmodifiableCollection = Collections.singleton(zzbmhVar);
                    } else {
/* 35 */                ArrayList arrayList = new ArrayList(collection);
/* 38 */                arrayList.add(zzbmhVar);
/* 41 */                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                    }
/* 60 */            return new zzbly(this.zzb, this.zzc, collectionUnmodifiableCollection, zzbmhVar2, this.zzg, this.zza, z, this.zze + 1);
                }

                public final zzbly zzb() {
                    return this.zzh ? this : new zzbly(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
                }

                public final zzbly zzc(zzbmh zzbmhVar) {
/* 7 */             zzgo.zzn(!this.zza, "Already passThrough");
/* 10 */            boolean z = zzbmhVar.zzb;
/* 12 */            Collection collectionUnmodifiableCollection = this.zzc;
/* 14 */            if (!z) {
/* 22 */                if (collectionUnmodifiableCollection.isEmpty()) {
/* 24 */                    collectionUnmodifiableCollection = Collections.singletonList(zzbmhVar);
                        } else {
/* 31 */                    ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
/* 34 */                    arrayList.add(zzbmhVar);
/* 37 */                    collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                        }
                    }
/* 16 */            Collection collection = collectionUnmodifiableCollection;
/* 42 */            zzbmh zzbmhVar2 = this.zzf;
/* 49 */            boolean z2 = zzbmhVar2 != null;
/* 50 */            List list = this.zzb;
/* 52 */            if (z2) {
/* 60 */                zzgo.zzn(zzbmhVar2 == zzbmhVar, "Another RPC attempt has already committed");
/* 63 */                list = null;
                    }
/* 75 */            return new zzbly(list, collection, this.zzd, zzbmhVar2, this.zzg, z2, this.zzh, this.zze);
                }
            }
