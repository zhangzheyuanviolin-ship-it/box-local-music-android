            package p000;

            import android.content.SharedPreferences;
            
            public final class l0IllIiO {
                public final String I00000oIO;
                public final boolean I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public final l0Oi0o I0000oI00;

                public l0IllIiO(l0Oi0o l0oi0o, String str, boolean z) {
/* 4 */             this.I0000oI00 = l0oi0o;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             this.I00000oIO = str;
/* 11 */            this.I00000oOI = z;
                }

                public final boolean I00000oIO() {
/* 3 */             if (!this.I0000Il00O) {
/* 6 */                 this.I0000Il00O = true;
/* 22 */                this.I0000O = this.I0000oI00.I010ioo().getBoolean(this.I00000oIO, this.I00000oOI);
                    }
/* 24 */            return this.I0000O;
                }

                public final void I00000oOI(boolean z) {
/* 7 */             SharedPreferences.Editor editorEdit = this.I0000oI00.I010ioo().edit();
/* 13 */            editorEdit.putBoolean(this.I00000oIO, z);
/* 16 */            editorEdit.apply();
/* 19 */            this.I0000O = z;
                }
            }
