            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.StreamingCallback;
            
            public final class l0ll0iOO extends i0IiIO implements ii1loioI {
                public final i11I1Ili I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l0ll0iOO(l0OlI0ioiIli l0oli0ioiili, i11I1Ili i11i1ili) {
/* 7 */             super("com.google.android.apps.aicore.aidl.ILLMStreamingCallback", 10);
/* 1 */             this.I000O01llI0 = i11i1ili;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 2 */             if (i != 2) {
/* 32 */                return false;
                    }
/* 4 */             int i2 = parcel.readInt();
/* 8 */             String string = parcel.readString();
/* 12 */            lO0Ooi.I00000oOI(parcel);
/* 19 */            StreamingCallback streamingCallback = (StreamingCallback) this.I000O01llI0.I00iiI;
/* 22 */            if (i2 == 1) {
/* 24 */                streamingCallback.onNewThought(string);
/* 21 */                return true;
                    }
/* 28 */            streamingCallback.onNewText(string);
/* 21 */            return true;
                }
            }
