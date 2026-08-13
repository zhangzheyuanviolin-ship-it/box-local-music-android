            package p000;

            import android.os.ParcelFileDescriptor;
            import java.util.concurrent.ExecutionException;
            
            public final class i0Iol0l1lIl {
                public i0IOo0i0 I00000oIO;

                public final ParcelFileDescriptor.AutoCloseInputStream I00000oIO(int i, int i2, String str, String str2) {
                    try {
/* 25 */                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) lOio0o.I00000oIO(((i0OiOI1) this.I00000oIO.I0000Il00O()).I0001Ioi1lo(i, i2, str, str2));
/* 27 */                if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
/* 37 */                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                        }
/* 80 */                throw new i0O0lI1oiO("Corrupted ParcelFileDescriptor, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i2, i);
                    } catch (InterruptedException e) {
/* 88 */                throw new i0O0lI1oiO(i, e, "Extractor was interrupted while waiting for chunk file.");
                    } catch (ExecutionException e2) {
/* 483 */               throw new i0O0lI1oiO(i, e2, "Error opening chunk file, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i2);
                    }
                }
            }
