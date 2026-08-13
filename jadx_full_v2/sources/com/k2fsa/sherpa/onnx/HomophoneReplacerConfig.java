            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;", "", "dictDir", "", "lexicon", "ruleFsts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDictDir", "()Ljava/lang/String;", "setDictDir", "(Ljava/lang/String;)V", "getLexicon", "setLexicon", "getRuleFsts", "setRuleFsts", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 20 */    public final class HomophoneReplacerConfig {
                private String dictDir;
                private String lexicon;
                private String ruleFsts;

                public HomophoneReplacerConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                }

                public static HomophoneReplacerConfig copy$default(HomophoneReplacerConfig homophoneReplacerConfig, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = homophoneReplacerConfig.dictDir;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = homophoneReplacerConfig.lexicon;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = homophoneReplacerConfig.ruleFsts;
                    }
/* 19 */            return homophoneReplacerConfig.copy(str, str2, str3);
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public final HomophoneReplacerConfig copy(String dictDir, String lexicon, String ruleFsts) {
/* 3 */             return new HomophoneReplacerConfig(dictDir, lexicon, ruleFsts);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof HomophoneReplacerConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            HomophoneReplacerConfig homophoneReplacerConfig = (HomophoneReplacerConfig) other;
                    return O0000Ioio00.I0000O(this.dictDir, homophoneReplacerConfig.dictDir) && O0000Ioio00.I0000O(this.lexicon, homophoneReplacerConfig.lexicon) && O0000Ioio00.I0000O(this.ruleFsts, homophoneReplacerConfig.ruleFsts);
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public int hashCode() {
/* 22 */            return this.ruleFsts.hashCode() + Oi010OO0.I000O01llI0(this.dictDir.hashCode() * 31, 31, this.lexicon);
                }

                public final void setDictDir(String str) {
/* 1 */             this.dictDir = str;
                }

                public final void setLexicon(String str) {
/* 1 */             this.lexicon = str;
                }

                public final void setRuleFsts(String str) {
/* 1 */             this.ruleFsts = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HomophoneReplacerConfig(dictDir=");
/* 10 */            sb.append(this.dictDir);
/* 15 */            sb.append(", lexicon=");
/* 20 */            sb.append(this.lexicon);
/* 25 */            sb.append(", ruleFsts=");
/* 32 */            return IlIi0I0.I000oI1ioi(sb, this.ruleFsts, ')');
                }

/* 21 */        public HomophoneReplacerConfig(String str, String str2, String str3) {
/* 23 */            this.dictDir = str;
/* 24 */            this.lexicon = str2;
/* 25 */            this.ruleFsts = str3;
                }

/* 25 */        public HomophoneReplacerConfig() {
/* 26 */            this(null, null, null, 7, null);
                }
            }
