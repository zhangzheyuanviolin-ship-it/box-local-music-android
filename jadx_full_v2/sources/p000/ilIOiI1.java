            package p000;

            import android.os.Parcel;
            import android.os.SystemClock;
            import com.google.mlkit.genai.summarization.zzg;
            
            public final class ilIOiI1 extends i0IiIO implements i1Oilo0O1i {
                public final zzg I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilIOiI1(zzg zzgVar) {
/* 6 */             super("com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback", 5);
/* 1 */             this.I000O01llI0 = zzgVar;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 2 */             if (i != 2) {
/* 34 */                return false;
                    }
/* 4 */             String string = parcel.readString();
/* 8 */             iil0Ii00oOI1.I00000oIO(parcel);
/* 11 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 15 */            zzg zzgVar = this.I000O01llI0;
/* 24 */            zzgVar.zza.compareAndSet(0L, jElapsedRealtime - zzgVar.zzb);
/* 29 */            zzgVar.zzc.onNewText(string);
/* 32 */            return true;
                }
            }
