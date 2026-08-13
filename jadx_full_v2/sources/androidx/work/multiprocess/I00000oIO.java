            package androidx.work.multiprocess;

            import p000.IIi0oIl;
            import p000.IIiOOI;
            import p000.IIiOOIoi0;
            
            public final class I00000oIO implements IIiOOIoi0 {
                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             String str = RemoteListenableWorker.ARGUMENT_PACKAGE_NAME;
/* 11 */            IIi0oIl.I000II().I0000oI00(RemoteListenableWorker.TAG, "startWork() shouldn't never be called on RemoteListenableWorker");
/* 19 */            iIiOOI.I0000O(new IllegalArgumentException("startWork() shouldn't never be called on RemoteListenableWorker"));
/* 22 */            return "RemoteListenableWorker Failed Future";
                }
            }
