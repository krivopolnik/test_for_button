package de.onesto.to.formbean;

import java.util.Date;
import java.util.Vector;

import de.onesto.to.ItinerarySpecificPaymentCards;
import de.onesto.to.OnestoTranslatableException;
import de.onesto.to.data.PaymentCard;


public class FB_Training extends FormBeanBaseItinerary
{

  protected boolean init()
  {
    boolean fSuccess = false;

    if (super.init())
    {
      addButton("TrainingResult");

      fSuccess = true;
    }
    return fSuccess;
  }

  /**
   * invoke method
   * 
   * used for calling private method (doButtonXXXXX and validateButtonXXXXX)
   */
  @Override
  protected boolean invokeMethod(java.lang.reflect.Method objMethod) throws Exception
  {
    final Object objNoParam[] = {};

    return ((Boolean) objMethod.invoke(this, objNoParam)).booleanValue();
  }

  protected boolean doButtonTrainingResult() throws OnestoTranslatableException
  {
    boolean fSuccess = false;
    setResultTrainig(getInput1() + getInput2());
    fSuccess = true;
    addErrorMessage("training", "error", "missing vaha");
    return fSuccess;
  }

  protected boolean validateTrainingResult() throws OnestoTranslatableException
  {
    boolean fSuccess = false;
    int input1 = getInput1();

    fSuccess = true;
    return fSuccess;
  }

  final public void setResultTrainig(Integer resultTrainig)
  {
    setPublicProperty("resultTrainig", resultTrainig);
  }

  final public Integer getResultTrainig()
  {
    return getPublicPropertyInt("resultTrainig");
  }

  final public void setInput1(String input1)
  {
    setPublicProperty("input1", input1);
  }

  final public Integer getInput1()
  {
    return getPublicPropertyInt("input1");
  }

  final public void setInput2(String input2)
  {
    setPublicProperty("input2", input2);
  }

  final public Integer getInput2()
  {
    return getPublicPropertyInt("input2");
  }

  @Override
  protected Vector getItinerarySpecificIdentificationCards()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected ItinerarySpecificPaymentCards getItinerarySpecificPaymentCards(
      Vector<PaymentCard> objAvailableCards)
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getItineraryType()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected boolean isBookingButton(String strButtonName)
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  protected boolean isItineraryRequestButton(String strButtonName)
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  protected boolean travelManagementFilter_Internal()
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void updateDefaultDates(Date objBeginDate, Date objEndDate)
  {
    // TODO Auto-generated method stub

  }
}