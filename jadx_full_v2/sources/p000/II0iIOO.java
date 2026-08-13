            package p000;

            import com.box.gallery.MainActivity;
            import java.io.IOException;
            import java.text.SimpleDateFormat;
            
            public final class II0iIOO extends iOOol1iOiIO {
                public IIOOoll I00000oIO;
                public O1O1oO11O I00000oOI;
                public IiI01lI I0000Il00O;
                public O1O1ol110 I0000O;

                @Override
                public final void I00000oIO(int i, CharSequence charSequence) throws IOException {
/* 1 */             SimpleDateFormat simpleDateFormat = Oii0IoIiOO.I00000oIO;
/* 23 */            Oii0IoIiOO.I00000oIO((MainActivity) this.I00000oIO.I00iiI, "BIOMETRIC_AUTH_ERROR: code=" + i);
/* 32 */            this.I0000O.invoke(Integer.valueOf(i), charSequence);
                }

                @Override
                public final void I00000oOI() throws IOException {
/* 1 */             SimpleDateFormat simpleDateFormat = Oii0IoIiOO.I00000oIO;
/* 11 */            Oii0IoIiOO.I00000oIO((MainActivity) this.I00000oIO.I00iiI, "BIOMETRIC_AUTH_FAILED");
/* 23 */            this.I0000Il00O.invoke(-1, "Authentication failed");
                }

                @Override
                public final void I0000Il00O(II0iil1 iI0iil1) throws IOException {
/* 1 */             SimpleDateFormat simpleDateFormat = Oii0IoIiOO.I00000oIO;
/* 11 */            Oii0IoIiOO.I00000oIO((MainActivity) this.I00000oIO.I00iiI, "BIOMETRIC_AUTH_SUCCESS");
/* 16 */            this.I00000oOI.invoke();
                }
            }
