package rd.neuron.neuron;

import org.jblas.FloatMatrix;

import rd.neuron.neuron.Layer.Function;

/**
 * Create a fully connected network with random weights and biases (between 0 and 1)
 * @author azahar
 *
 */
public class RandomWeightsUnitBiasLayerBuilder implements LayerBuilder{

	@Override
	public Layer build(int numberOfInputNeurons,int numberOfOutputNeurons,Function f)
	{
		if(numberOfInputNeurons<=0 || numberOfOutputNeurons<=0)
		{
			throw new IllegalArgumentException("Number of neurons cannont be <=0");
		}
		
		FloatMatrix weights = FloatMatrix.rand(numberOfInputNeurons,numberOfOutputNeurons);  //Out x In
		FloatMatrix bias = FloatMatrix.ones(numberOfOutputNeurons,1);  //Out x 1
		
		return new Layer(weights,bias,f);
	}
}
