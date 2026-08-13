            package p000;

            import android.content.SharedPreferences;
            import java.util.Objects;
            
            public final class l0O0o010I {
                public final String I00000oIO;
                public final long I00000oOI;
                public boolean I0000Il00O;
                public long I0000O;
                public final l0Oi0o I0000oI00;

                public l0O0o010I(l0Oi0o l0oi0o, String str, long j) {
/* 4 */             Objects.requireNonNull(l0oi0o);
/* 7 */             this.I0000oI00 = l0oi0o;
/* 9 */             lII0I0I000I.I0000O(str);
/* 12 */            this.I00000oIO = str;
/* 14 */            this.I00000oOI = j;
                }

                public final long I00000oIO() {
/* 3 */             if (!this.I0000Il00O) {
/* 6 */                 this.I0000Il00O = true;
/* 22 */                this.I0000O = this.I0000oI00.I010ioo().getLong(this.I00000oIO, this.I00000oOI);
                    }
/* 24 */            return this.I0000O;
                }

                public final void I00000oOI(long j) {
/* 7 */             SharedPreferences.Editor editorEdit = this.I0000oI00.I010ioo().edit();
/* 13 */            editorEdit.putLong(this.I00000oIO, j);
/* 16 */            editorEdit.apply();
/* 19 */            this.I0000O = j;
                }
            }
