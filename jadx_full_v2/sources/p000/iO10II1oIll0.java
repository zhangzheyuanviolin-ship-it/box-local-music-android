            package p000;

            import android.media.MediaPlayer;
            
            public abstract class iO10II1oIll0 {
                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public static final void I00000oIO(p000.O1ol100o0O r70, p000.OlI1IliO0I r71, p000.IloI0lOlll1 r72, int r73) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 1916
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.iO10II1oIll0.I00000oIO(O1ol100o0O, OlI1IliO0I, IloI0lOlll1, int):void");
                }

                public static final void I00000oOI(OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 5 */             MediaPlayer mediaPlayer = (MediaPlayer) oI10i0Il.getValue();
/* 7 */             if (mediaPlayer != null) {
                        try {
/* 13 */                    if (mediaPlayer.isPlaying()) {
/* 15 */                        mediaPlayer.stop();
                            }
                        } catch (Throwable th) {
/* 20 */                    lIoii1l01l0i.I00000oIO(th);
                        }
/* 23 */                mediaPlayer.release();
                    }
/* 27 */            oI10i0Il.setValue(null);
/* 32 */            oI10i0Il2.setValue(Boolean.FALSE);
                }
            }
