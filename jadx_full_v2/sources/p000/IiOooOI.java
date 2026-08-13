            package p000;

            import androidx.work.impl.model.SystemIdInfo;
            import androidx.work.impl.model.SystemIdInfoDao;
            import androidx.work.impl.model.WorkNameDao;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkTagDao;
            import java.io.IOException;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class IiOooOI {
                public static final String I00000oIO = IIi0oIl.I000OiO("DiagnosticsWrkr");

                public static final String I00000oIO(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) throws IOException {
/* 5 */             StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                WorkSpec workSpec = (WorkSpec) it.next();
/* 30 */                SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(liIOI1iO.I00000oIO(workSpec));
/* 43 */                Integer numValueOf = systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null;
/* 143 */               sb.append("\n" + workSpec.id + "\t " + workSpec.workerClassName + "\t " + numValueOf + "\t " + workSpec.state.name() + "\t " + IOOi0Ool1i.I00IlilI0i0i(workNameDao.getNamesForWorkSpecId(workSpec.id), ",", null, null, null, 62) + "\t " + IOOi0Ool1i.I00IlilI0i0i(workTagDao.getTagsForWorkSpecId(workSpec.id), ",", null, null, null, 62) + '\t');
                    }
/* 148 */           return sb.toString();
                }
            }
